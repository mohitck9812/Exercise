const problem = document.getElementById("problem");

problem.innerHTML = `
  <p><strong>Given problem statement is: (click on code to copy)</strong></p>
  <pre><code>
function add(a, b) {
    return a + b;
}
  </code></pre>

  <p><strong>Solution to the problem is:</strong></p>
  <pre><code>
(a, b) => a + b
  </code></pre>
`;

const codeBlocks = document.getElementsByTagName("code");

for (let code of codeBlocks) {
  code.style.cursor = "pointer";
  code.title = "Click to copy";

  code.addEventListener("click", () => {
    const textToCopy = code.innerText.trim();
    navigator.clipboard
      .writeText(textToCopy)
      .then(() => {
        code.style.backgroundColor = "#d4f7d4";
        code.title = "Copied!";
      })
      .catch((err) => {
        console.error("Failed to copy text: ", err);
      });
  });

  code.addEventListener("mouseleave", () => {
    code.style.backgroundColor = "#f0f0f0";
    code.title = "Click to copy";
  });
}
