import Header from "../components/Header";
import ParticipantList from "../components/CadastroList";

const Lista = ({ participants }) => {
  return (
    <div className="min-h-screen bg-rose-50 flex flex-col">
      <Header />
      <main className="p-5">
        <div className="w-full bg-rose-50 p-5 text-center flex flex-col overflow-auto">
          <h1 className="text-2xl font-bold text-gray-800 mb-4">
            PARTICIPANTES
          </h1>
          <ParticipantList participants={participants} />
        </div>
      </main>
    </div>
  );
};

export default Lista;
