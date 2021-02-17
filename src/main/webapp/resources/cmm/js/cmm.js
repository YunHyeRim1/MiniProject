'use strict'
var cmm = cmm || {}
cmm = (() => {
<<<<<<< HEAD
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
=======
	const init = x => {
        $('#user-page').click(e => {location.href=`${x}/move/uss/index`})
        $('#booking-page').click(e => {location.href=`${x}/move/bkg/index`})

>>>>>>> refs/heads/develop-keb
	}
<<<<<<< HEAD
>>>>>>> refs/heads/develop-pwy
=======
>>>>>>> refs/heads/develop-keb
	const goHome = x => {location.href = `${x}/`}
<<<<<<< HEAD
<<<<<<< HEAD
	return { init, goHome }
})()
=======
	return {init, goHome}
=======
	return { init, goHome }
>>>>>>> refs/heads/develop-keb
})()
>>>>>>> refs/heads/develop-pwy
