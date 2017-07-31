


<%@include file="includes/header.jsp"%>	

<div class="container-fluid">




<div class="panel panel-default">
  <div class="panel-header">
  <h4><span class="glyphicon glyphicon-education"></span> Sign-Up</h4>
      </div>    
       <div class="panel-body">
        <div  style="padding:40px 50px;">


     
          <form:form action="/sign-up"  modelAttribute="signupForm" role="form">
          
          <form:errors />
          
                  <div>
                  
                  
          <h3 class="text-primary">*All the fields are Mandatory</h3>
          <br>
          </div>
            
            <div class="form-group">
            	<label><span class="glyphicon glyphicon-user"></span> Name*</label>
                <form:input type="text" path="name" id="name" name="name" class="form-control " placeholder="Enter Name" />
                <form:errors cssClass="error" path="name" />
             </div>
            
              
            
            
            <div class="form-group">
              <label><span class="glyphicon glyphicon-user"></span>  E-Mail- <small>(This will be your login ID)*</small></label>
              <form:input type="email" path="email" class="form-control " id="email" name="email" placeholder="Enter email" />
              <form:errors cssClass="error" path="email" />
            </div>
            <div class="form-group">
              <label><span class="glyphicon glyphicon-lock"></span> Password*</label>
              <form:input type="password" path="password" class="form-control " id="password" name="password" placeholder="Enter password" />
              <form:errors cssClass="error" path="password" />
            </div>
             <div class="form-group">
              <label><span class="glyphicon glyphicon-lock"></span> Confirm Password*</label>
              <input type="password" class="form-control " id="cnfrm_password" name="cnfrm_password" placeholder="Confirm password">
            </div>
            

                  
                      <br>

          
          
            
             <div align="center">
        
                
              <button type="submit" class="btn btn-primary btn-md" style="font-size:20px"> Let Me in!</button><br>
              
</div>
              
<br><br>
              
        </form:form>
        
        </div>
        </div>
        </div>
        </div>
     <%@include file="includes/footer.jsp"%>	