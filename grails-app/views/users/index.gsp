		<p>HEllo</p>

		<g:each in="${name}" var="na" status="i">
            <h3>${i+1}. ${na.stdName}, ${na.stdEmail}</h3>
            <br/>
        </g:each>