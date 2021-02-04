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
				inquiry: $('#inquiry').val(),
				posterImage: $('#poster_image').val()
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
	
	const list = x => {	
		$.getJSON(`${x.ctx}/shows/list/${x.pageSize}/${x.pageNum}`, d => { 
			$(`<h3/>`)
			.attr({id: `title`})
			.text(`전시회 목록`)
			.appendTo(`#shw-data`)
			$(`<table/>`)
			.attr({id: `tab`})
			.css({width: `100%`})
			.appendTo(`#title`) 
			$(`<tr/>`).attr({id: `tr_1`}).appendTo(`#tab`)
			$.each(
				[`No`,`제목`,`기간`,`시간`,`장소`,`입장연령`,`가격`,`주최`,`주관`,`문의`,`포스터`], 
				(i,j) => {
				$(`<th>${j}</th>`).css({backgroundColor: `MediumPurple`, fontSize: `small`})
				.appendTo(`#tr_1`)
			})
			$.each(d.list, 
				(i, j) => {
						$(`<tr><td>${j.showNum}</td>
			   	    		<td>${j.title}</td>
			   	    		<td>${j.period}</td>
							<td>${j.time}</td>
							<td>${j.venue}</td>
							<td>${j.admission}</td>
							<td>${j.price}</td>
							<td>${j.host}</td>
							<td>${j.management}</td>
							<td>${j.inquiry}</td>
							<td>${j.posterImage}</td></tr>`)
							.css({padding: `15px`, textAlign: `left`, fontSize: `small`})
							.appendTo(`#tab`)
			})
			$(`<div/>`)
			.attr({id: `show_page`})
			.addClass(`pagination`)
			.appendTo(`#shw-data`)
			const page = d.page
			
			function* range(start, end) {
			    yield start;
			    if (start === end) return;
			    yield* range(start + 1, end);
			}
			
			if(page.existPrev){
				$(`<a/>`)
				.attr({href: `#`})
				.text(`<<`)
				.css({backgroundColor: `White`})
				.appendTo(`#show_page`)
				.click(e=>{
					e.preventDefault()
					$(`#shw-data`).empty()
					show.list({ctx: x.ctx, pageSize: `10`, pageNum: page.prevBlock})
				})
			}
			$.each(
				[...range(page.startPage, page.endPage)] ,
				 (i, j) => {
					$(`<a/>`)
						.attr({href: `#`})
						.css({backgroundColor: (j != page.pageNum) ? `White` : `Lavender`})
						.text(`${j}`)
						.appendTo(`#show_page`)
						.click(e=>{
							e.preventDefault()
							$(`#shw-data`).empty()
							stu.list({ctx: x.ctx, pageSize: `10`, pageNum: j})
						})
			})
			if(page.existNext){
				$(`<a/>`)
				.attr({href: `#`})
				.css({backgroundColor: `White`})
				.text(`>>`)
				.appendTo(`#show_page`)
				.click(e=>{
					e.preventDefault()
					$(`#shw-data`).empty()
					stu.list({ctx: x.ctx, pageSize: `10`, pageNum: page.nextBlock})
				})
			}
		})
	}

})