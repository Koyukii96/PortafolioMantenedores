package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.Ejecutivo;
import com.jwt.model.Employee;
import com.jwt.service.EjecutivoService;

@Controller
public class EjecutivoController {

	private static final Logger logger = Logger
			.getLogger(EjecutivoController.class);

	public EjecutivoController() {
		System.out.println("EjecutivoController()");
	}

	@Autowired
	private EjecutivoService ejecutivoService;

	@RequestMapping(value = "/ejecutivo")
	public ModelAndView listaEjecutivos(ModelAndView model) throws IOException {
		List<Ejecutivo> listEjecutivo = ejecutivoService.getAllEjecutivo();
		model.addObject("listEjecutivo", listEjecutivo);
		model.setViewName("home2");
		return model;
	}

	@RequestMapping(value = "/newEjecutivo", method = RequestMethod.GET)
	public ModelAndView newContacto(ModelAndView model) {
		Ejecutivo ejecutivo = new Ejecutivo();
		model.addObject("ejecutivo", ejecutivo);
		model.setViewName("EjecutivoForm");
		return model;
	}

	@RequestMapping(value = "/saveEjecutivo", method = RequestMethod.POST)
	public ModelAndView saveEjecutivo(@ModelAttribute Ejecutivo ejecutivo) {
		if (ejecutivo.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			ejecutivoService.addEjecutivo(ejecutivo);
		} else {
			ejecutivoService.updateEjecutivo(ejecutivo);
		}
		return new ModelAndView("redirect:/ejecutivo");
	}

	@RequestMapping(value = "/deleteEjecutivo", method = RequestMethod.GET)
	public ModelAndView deleteEjecutivo(HttpServletRequest request) {
		int ejecutivoId = Integer.parseInt(request.getParameter("id"));
		ejecutivoService.deleteEjecutivo(ejecutivoId);
		return new ModelAndView("redirect:/ejecutivo");
	}

	@RequestMapping(value = "/editEjecutivo", method = RequestMethod.GET)
	public ModelAndView editarEjecutivo(HttpServletRequest request) {
		int ejecutivoId = Integer.parseInt(request.getParameter("id"));
		Ejecutivo ejecutivo = ejecutivoService.getEjecutivo(ejecutivoId);
		ModelAndView model = new ModelAndView("EjecutivoForm");
		model.addObject("ejecutivo", ejecutivo);

		return model;
	}
}
