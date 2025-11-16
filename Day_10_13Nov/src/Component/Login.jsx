import { useState } from "react";
import { Navigate } from "react-router-dom";

export default function Login() {
    const authData = JSON.parse(localStorage.getItem("authData"));
    const [user, setUser] = useState(authData ? authData.user : "");
    const [inputValue, setInputValue] = useState("");

    if (user) {
        return <Navigate to="/home" replace />;
    }

    const handleSubmit = (e) => {
        e.preventDefault();

        if (inputValue.trim() === "") {
            alert("Please enter a name");
            return;
        }

        const data = {
            user: inputValue,
        };

        localStorage.setItem("authData", JSON.stringify(data));

        setUser(inputValue);
    };

    return (
        <>
            <div className="card">
                <form onSubmit={handleSubmit}>
                    <label htmlFor="name">Enter Name</label>
                    <input
                        type="text"
                        id="name"
                        value={inputValue}
                        onChange={(e) => setInputValue(e.target.value)}
                        placeholder="Enter username"
                    />

                    <button type="submit">Login</button>
                </form>
            </div>
        </>
    );
}
