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
import com.jwt.model.TipoActividad;
import com.jwt.service.TipoActividadService;

@Controller
public class TipoActividadController {

	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);

	public TipoActividadController() {
		System.out.println("Entro a TipoActividadController");
	}

	@Autowired
	private TipoActividadService tipoService;

	@RequestMapping(value = "/tipoActividad")
	public ModelAndView listTipoActividad(ModelAndView model) throws IOException {
		List<TipoActividad> listTipoActividad = tipoService.getAllTipoActividad();
		model.addObject("listTipoActividad", listTipoActividad);
		model.setViewName("TipoActividadPage");
		return model;
	}

	@RequestMapping(value = "/nuevoTipoActividad", method = RequestMethod.GET)
	public ModelAndView nuevoTipoActividad(ModelAndView model) {
		TipoActividad tipoActividad = new TipoActividad();
		model.addObject("tipoActividad", tipoActividad);
		model.setViewName("TipoActividadForm");
		return model;
	}

	@RequestMapping(value = "/guardarTipoActividad", method = RequestMethod.POST)
	public ModelAndView guardarTipoActividad(@ModelAttribute TipoActividad tipoActividad) {
		if (tipoActividad.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			tipoService.addTipoActividad(tipoActividad);
		} else {
			tipoService.updateTipoActividad(tipoActividad);
		}
		return new ModelAndView("redirect:/tipoActividad");
	}

	@RequestMapping(value = "/borrarTipoActividad", method = RequestMethod.GET)
	public ModelAndView borrarTipoActividad(HttpServletRequest request) {
		int tipoActividadId = Integer.parseInt(request.getParameter("id"));
		tipoService.deleteTipoActividad(tipoActividadId);
		return new ModelAndView("redirect:/tipoActividad");
	}

	@RequestMapping(value = "/editarTipoActividad", method = RequestMethod.GET)
	public ModelAndView editarTipoActividad(HttpServletRequest request) {
		int tipoActividadId = Integer.parseInt(request.getParameter("id"));
		TipoActividad tipoActividad = tipoService.getTipoActividad(tipoActividadId);
		ModelAndView model = new ModelAndView("TipoActividadForm");
		model.addObject("tipoActividad", tipoActividad);

		return model;
	}

}