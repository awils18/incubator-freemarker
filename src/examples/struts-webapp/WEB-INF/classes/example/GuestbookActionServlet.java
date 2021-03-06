/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package example;

import java.util.*;
import javax.servlet.*;

import org.apache.struts.action.ActionServlet;

public class GuestbookActionServlet extends ActionServlet {
    
    static final String GUESTBOOK_KEY = "guestbook";
    
    public void init(ServletConfig scfg) throws ServletException {
        super.init(scfg);
        
        ServletContext sctx = scfg.getServletContext();
        
        // Add application specific global objects
        sctx.setAttribute(GUESTBOOK_KEY, new ArrayList()); 
    }
}
