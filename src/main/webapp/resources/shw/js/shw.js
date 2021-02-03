'use strict'
var shw = shw || {}
shw = (() => {
	const add = x => {
		alert(`등록하기 진입`)
		$.ajax({
			url: `${x}/shows`,
			type: `POST`,
			data: JSON.stringify({
				showNum: 0,
                title: $('#title').val(),
                period: $('#period').val(),
                time: $('#time').val(),
                venue: $('#venue').val(),
                admission: $('#admission').val(),
                price: $('#price').val(),
				host: $('#host').val(),
				management: $('#management').val(),
				inquiry: $('#inquiry').val()
			}),
			dataType: 'json',
            contentType: 'application/json',
            success: d => {
                if(d === 'SUCCESS'){
                    alert(`전시회 등록 완료`)
                    location.href=`${x}/move/shw/list`
                }else{
                    alert(`전시회 등록 실패`)
                    location.reload()
                }
            },
            error: e => { alert(`전시회 등록 실패: ${e}`)}
		})
	}
})