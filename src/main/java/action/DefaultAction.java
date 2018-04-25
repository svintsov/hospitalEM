package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DefaultAction implements Action {

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    return "error";
  }
}
