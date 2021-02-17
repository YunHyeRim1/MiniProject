'use strict'
var cmm = cmm || {}
cmm = (() => {
<<<<<<< HEAD

	const init = x => { // add 페이지로 이동하는 거
        $('#add').click(e => {location.href=`${x}/move/shw/add`})
        $('#list').click(e => {location.href=`${x}/move/shw/list`})
		
		}

=======
	const init = x => {
		$('#write').click(e => {location.href=`${x}/move/brd/write`})
		$('#list').click(e => {location.href=`${x}/move/brd/list`})
		$('#detail').click(e => {location.href=`${x}/move/brd/detail`})
	}
>>>>>>> refs/heads/develop-pwy
	const goHome = x => {location.href = `${x}/`}
<<<<<<< HEAD
	return { init, goHome }
})()
=======
	return {init, goHome}
})()
>>>>>>> refs/heads/develop-pwy
