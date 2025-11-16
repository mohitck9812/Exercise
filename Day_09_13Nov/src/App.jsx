import { BrowserRouter, Route, Routes } from "react-router-dom";
import Login from "./Component/Login";
import Home from "./Component/Home";
import NotFound from "./Component/NotFound";

import "./App.css";
import Counter from "./Component/Counter";
import DigitalClock from "./Component/DigitalClock";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/" element={<Home />} >
          <Route path="counter" element={<Counter />} />
          <Route path="clock" element={<DigitalClock />} />
        </Route>


        <Route path="*" element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
