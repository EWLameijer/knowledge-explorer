import { useEffect, useState } from "react";
import axios from "axios";

interface NodeContents {
  id: number;
  description: string;
}

function App() {
  const [nodeContents, setNodeContents] = useState<NodeContents>();

  useEffect(() => {
    axios
      .get("http://localhost:8080/1")
      .then((response) => setNodeContents(response.data));
  }, []);

  return (
    <>
      <h1>Knowledge Explorer</h1>
      <p>{nodeContents?.description}</p>
    </>
  );
}

export default App;
