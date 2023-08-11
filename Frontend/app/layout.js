import Navbar from "./components/Navbar";
export default function RootLayout(props) {
  const { children } = props;
  return (
    <html lang="en">
      <body>
        <Navbar />
        {children}
      </body>
    </html>
  );
}
