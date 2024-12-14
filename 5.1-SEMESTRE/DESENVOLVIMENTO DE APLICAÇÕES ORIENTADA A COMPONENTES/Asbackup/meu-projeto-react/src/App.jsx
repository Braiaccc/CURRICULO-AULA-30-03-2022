import { useState, useEffect } from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";
import Lista from "./pages/Lista";

const App = () => {
  const [participants, setParticipants] = useState(() => {
    // Recuperar os dados salvos no localStorage ao carregar a aplicação
    const savedParticipants = localStorage.getItem("participants");
    return savedParticipants ? JSON.parse(savedParticipants) : [];
  });

  useEffect(() => {
    // Salvar os participantes no localStorage sempre que houver alterações
    localStorage.setItem("participants", JSON.stringify(participants));
  }, [participants]);

  const handleAddParticipant = (newParticipant) => {
    setParticipants((prevParticipants) => [...prevParticipants, newParticipant]);
  };

  return (
    <Router>
      <Routes>
        <Route
          path="/"
          element={<Home participants={participants} onAddParticipant={handleAddParticipant} />}
        />
        <Route path="/lista" element={<Lista participants={participants} />} />
      </Routes>
    </Router>
  );
};

export default App;
