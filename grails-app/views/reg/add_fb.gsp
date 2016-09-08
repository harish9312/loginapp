<g:form controller="reg" action="regs">
<g:textField name="feedback" />
<g:textField name="course"  />
<g:textField name="user" hidden="true" value="${user1.us}" />
<g:submitButton name="login" class="save" value="Login" />
</g:form>