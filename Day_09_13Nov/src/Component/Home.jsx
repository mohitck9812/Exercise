import { useNavigate, Outlet } from "react-router-dom";

export default function Home() {
  const navigate = useNavigate();

  return (
    <div className="h-dvh bg-gray-600 flex flex-col gap-4 items-center justify-center">
      <h1 className="text-4xl">
        This is home page. To go to a particular page press the button
      </h1>

      <div className="flex gap-5">
        <button onClick={() => navigate("counter")}>Counter</button>
        <button onClick={() => navigate("clock")}>Clock</button>
      </div>

      <Outlet />
    </div>
  );
}
