import { useState } from "react";

export default function Counter() {
  const [count, setCount] = useState(0);

  return (
    <>
      <div className="flex flex-col justify-center items-center h-dvh w-dvh gap-5 bg-cyan-950">
        <h1 className="text-4xl text-blue-200">Counter: {count}</h1>
        <button
          className="border border-0 border-white rounded-4xl text-7xl p-3 text-emerald-700 bg-black"
          onClick={() => setCount((p) => p + 1)}
        >
          Counter++
        </button>
      </div>
    </>
  );
}
