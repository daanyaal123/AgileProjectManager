import { GET_ERRORS } from "./types";
import axios from "axios";

export const createProject = (project, history) => async (dispatch) => {
  try {
    const result = await axios.post("http://localhost:8080/project", project);
  } catch (error) {
    console.log(error.response);
    dispatch({
      type: GET_ERRORS,
      payload: error.message,
    });
  }
};
