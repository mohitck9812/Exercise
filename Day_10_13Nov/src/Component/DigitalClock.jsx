import { useEffect, useState } from "react";

export default function DigitalClock() {
  const [date, setDate] = useState(new Date());

  useEffect(() => {
    const interval = setInterval(() => {
      setDate(new Date());
    }, 1000);

    return () => clearInterval(interval);
  }, []);

  return (
    <>
    <div className="h-dvh w-dvh bg-cyan-900 ">
      <h1 className="h-full flex justify-center text-7xl items-center text-amber-800 ">
        {date.getHours() < 10 ? `0${date.getHours()}` : date.getHours()} : {date.getMinutes() < 10 ? `0${date.getMinutes()}` : date.getMinutes()} : {date.getSeconds() < 10 ? `0${date.getSeconds()}` : date.getSeconds()}
      </h1>
      </div>
    </>
  );
}
