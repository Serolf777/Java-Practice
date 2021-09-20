import "./style.scss";
import React, { useState } from "react";
import ReactDOM from "react-dom";

const App = () => {
  const [alliance, setAlliance] = useState("noneChosen");

  const toggleCheckBox = (event) => {
    setChecked(!isChecked);
    setAlliance(JSON.parse(event.target.dataset.info));
  };

  return(
    <div id="wholePage">
      <div className="checkboxes">
          <label className="container">
            <input
              type="checkbox"
              checked={isChecked && alliance === "test1"}
              onChange={toggleCheckBox}
              data-info={JSON.stringify("test1")}
            />
            <span style={{ marginLeft: "10px", marginRight: "24px" }}>
              Test1
            </span>
          </label>
          <label className="container">
            <input
              type="checkbox"
              checked={isChecked && alliance === "test2"}
              onChange={toggleCheckBox}
              data-info={JSON.stringify("test2")}
            />
            <span style={{ marginLeft: "10px", marginRight: "24px" }}>
              Test2
            </span>
          </label>
      </div>

    </div>

  )

}

ReactDOM.render(<App />, document.getElementById("App"));