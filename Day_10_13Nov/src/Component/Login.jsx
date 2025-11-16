import { useState } from "react";
import { Navigate } from "react-router-dom";

export default function Login() {
  const authData = JSON.parse(localStorage.getItem("authData"));
  const [user, setUser] = useState(authData ? authData.user : "");
  const [inputValue, setInputValue] = useState("");
  const [loading, setLoading] = useState(false);

  if (user) {
    return <Navigate to="/" replace />;
  }

  const handleSubmit = (e) => {
    e.preventDefault();

    if (inputValue.trim() === "") {
      alert("Please enter a name");
      return;
    }

    setLoading(true);

    setTimeout(() => {
      const data = { user: inputValue };
      localStorage.setItem("authData", JSON.stringify(data));
      setUser(inputValue);
    }, 1000); 
  };

  if (loading) {
    return (
      <div className="h-dvh flex items-center justify-center text-4xl">
        ⏳ Loading...
      </div>
    );
  }

  return (
    <div className="card">
      <form
        onSubmit={handleSubmit}
        className="flex flex-col items-center justify-center gap-5 h-dvh"
      >
        <input
          type="text"
          id="name"
          value={inputValue}
          onChange={(e) => setInputValue(e.target.value)}
          placeholder="Enter username"
          className="border border-2 rounded-2xl p-4"
        />

        <button type="submit">Login</button>
      </form>
    </div>
  );
}
