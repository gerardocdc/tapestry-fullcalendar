$(document).ready(function() {
	$('#calendar').fullCalendar({
		defaultView: 'agendaWeek',
		firstDay: 1,
		minTime:8,
		maxTime:22,
		timeFormat: "H:mm '-' {H:mm}",
		columnFormat: {
			day: 'dddd d',
			week: 'dddd d',
			month: 'dddd'
		},
		titleFormat: {
			day: 'dddd, d MMM  yyyy',
			month: 'MMMM yyyy',
			week: "d[ yyyy]{ '&#8212;'[ MMM] d MMM yyyy}"
		},
		header: {
			left: 'prev,next',
			center: 'title',
			right: 'month,agendaWeek,agendaDay'
		},
		monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio',  'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
		monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
		dayNames: ['Domingo', 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado'],
		dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mie', 'Jue', 'Vie', 'Sab'],
		eventSources: [
			{
				url: "https://www.google.com/calendar/feeds/farmaciaolivet%40gmail.com/public/basic",
				className: 'gcal-event',
				editable: false
			}
		],
		loading: function(bool) {
			if (bool) $('#loading').show();
			else $('#loading').hide();
		},
		editable: true
	})
});