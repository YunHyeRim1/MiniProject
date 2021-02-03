'use strict'
var cmm = cmm || {}
cmm = (() => {
	const init = x => {
        $('#add').click(e => {location.href=`${x}/move/shw/add`})
        $('#list').click(e => {location.href=`${x}/move/shw/list`})
	}
	return {init}
})()