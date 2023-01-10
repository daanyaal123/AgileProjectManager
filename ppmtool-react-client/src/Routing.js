import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Dashboard from "./components/dashboard";
import AddProject from "./components/Project/AddProject";

const Routing = () => {
  return (
    <Router>
      <Routes>
        <Route exact path="/" element={<Dashboard />} />
        <Route exact path="/dashboard" element={<Dashboard />} />
        <Route exact path="/addProject" element={<AddProject />} />
      </Routes>
    </Router>
  );
};

export default Routing;
