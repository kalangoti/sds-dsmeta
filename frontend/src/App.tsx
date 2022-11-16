import Header from "./components/Header";
import SalesCard from "./components/SalesCard";

import { registerLocale, setDefaultLocale } from "react-datepicker";
import ptBR from "date-fns/locale/pt-BR";

function App() {
  registerLocale("pt-BR", ptBR);
  setDefaultLocale("pt-BR");

  return (
    <>
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
