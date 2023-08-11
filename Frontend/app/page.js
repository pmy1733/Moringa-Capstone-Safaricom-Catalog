"use client";
import Box from "@mui/material/Box";
import Link from "next/link";
import { useRouter } from "next/navigation";

import Card from "@mui/material/Card";
import Container from "@mui/material/Container";
import { Button, Grid } from "@mui/material";
import Typography from "@mui/material/Typography";
import Navbar from "./components/Navbar";

export default function Home() {
  const router = useRouter();
  return (
    <Grid container item xs={12}>
      <Container sx={{ height: "100vh", width: "100%" }}>
        <Box
          sx={{
            display: "flex",
            flexDirection: "column",
            gap: 3,
            justifyContent: "center",
            alignItems: "center",

            // minHeight: "100vh",
          }}
        >
          <Card
            sx={{
              width: 500,
              height: 400,
              display: "flex",
              flexDirection: "column",
              gap: 3,
              justifyContent: "center",
              alignItems: "center",
            }}
          >
            {" "}
            <Typography>July Bespoke</Typography>
            <Typography variant="h3">Product Catalogue</Typography>
            <Box sx={{ display: "flex", gap: 4 }}>
              <Button variant="contained" onClick={() => router.push("/login")}>
                {" "}
                Login
              </Button>
              <Button
                variant="contained"
                onClick={() => router.push("/register")}
              >
                {" "}
                Register
              </Button>
            </Box>
          </Card>
        </Box>
      </Container>
    </Grid>
  );
}
