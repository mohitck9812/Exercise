import { BrowserRouter, Route, Routes } from "react-router-dom";
import Login from "./Component/Login";
import Home from "./Component/Home";
import NotFound from "./Component/NotFound";

import "./App.css";
import Counter from "./Component/Counter";
import DigitalClock from "./Component/DigitalClock";

function App() {
      const authData = JSON.parse(localStorage.getItem("authData"));
  
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/login" element={<Login authData={authData}/>} />
        <Route path="/" element={<Home authData={authData}/>} >
          <Route path="counter" element={<Counter />} />
          <Route path="clock" element={<DigitalClock />} />
        </Route>


        <Route path="*" element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
