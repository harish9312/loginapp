<g:from action="">
  
  <fieldset class="form">
   
    <label for="username"></label>
   
      <g:textField name="userName" value="${userInstance?.userName}"/>

<g:field type="password" name="password" value="${userInstance?.password}"/>

<g:submitButton name="login" class="save" value="Login" />

</g:form>