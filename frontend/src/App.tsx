import { ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import Header from "./components/Header";
import SalesCard from "./components/SalesCard";

import { registerLocale, setDefaultLocale } from "react-datepicker";
import ptBR from "date-fns/locale/pt-BR";

function App() {
  registerLocale("pt-BR", ptBR);
  setDefaultLocale("pt-BR");

  return (
    <>
      <ToastContainer />
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container"></div>
          <SalesCard />
        </section>
      </main>
    </>
  );
}

export default App;
