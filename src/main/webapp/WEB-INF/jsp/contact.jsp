<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<!DOCTYPE html>
<html lang="en">

<head>

  <%@include file="_head.jsp" %>

</head>

<body class="bg-dark-3-light">

<%@include file="_navbar.jsp" %>

  <div id="contact" class="contact-section">
    <div class="container">

      <div class="row">

        <div class="col-md-4 mb-3 mb-md-0">
          <div class="card py-4 h-100 bg-secondary">
            <div class="card-body text-center">
              <i class="fas fa-map-marked-alt text-primary mb-2"></i>
              <h4 class="text-uppercase m-0">Addrese</h4>
              <hr class="my-4">
              <div class="text-black-50">34 rue Jean Jaures, Aubervilliers 93300</div>
            </div>
          </div>
        </div>

        <div class="col-md-4 mb-3 mb-md-0">
          <div class="card py-4 h-100 bg-secondary">
            <div class="card-body text-center">
              <i class="fas fa-envelope text-primary mb-2"></i>
              <h4 class="text-uppercase m-0">Email</h4>
              <hr class="my-4">
              <div class="text-black-50">
                <a href="#">Contact.amis@free.fr</a>
              </div>
            </div>
          </div>
        </div>

        <div class="col-md-4 mb-3 mb-md-0">
          <div class="card py-4 h-100 bg-secondary">
            <div class="card-body text-center">
              <i class="fas fa-mobile-alt text-primary mb-2"></i>
              <h4 class="text-uppercase m-0">Telephone</h4>
              <hr class="my-4">
              <div class="text-black-50">06.56.45.34.56</div>
            </div>
          </div>
        </div>

      </div>

  

    </div>

  </div>

  <div class="map-responsive">
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2622.613437307189!2d2.3864256156746224!3d48.903703805469135!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47e66c3725421db7%3A0xeb2c5cd8883d3989!2s34%20Rue%20Auvry%2C%2093300%20Aubervilliers!5e0!3m2!1sfr!2sfr!4v1575390782620!5m2!1sfr!2sfr" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
  </div>

<%@include file="_footer.jsp" %>

<%@include file="_js.jsp" %>

  </body>
  </html>