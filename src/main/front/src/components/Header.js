import React from 'react';
import { Container, Nav, Navbar } from 'react-bootstrap';
import { Link } from 'react-router-dom';

const Header = () => {
  return (
    <Navbar bg="dark" variant="dark">
      <Container>
        <Link to="/" className="navbar-brand">List</Link>
        <Nav className="me-auto">
          <Link to ="/" className="nav-link">홈</Link>
          <Link to ="/write" className="nav-link">글쓰기</Link>
          <Link to ="/mbtiTest" className="nav-link">검사</Link>
          <Link to ="/test" className="nav-link">테스트</Link>
        </Nav>
      </Container>
    </Navbar>
  );
};

export default Header;