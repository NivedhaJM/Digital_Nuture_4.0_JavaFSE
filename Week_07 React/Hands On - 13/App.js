import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [activeComponent, setActiveComponent] = useState("book");

  const showComponent = () => {
    // Conditional rendering using switch-case
    switch (activeComponent) {
      case "book":
        return <BookDetails />;
      case "blog":
        return <BlogDetails />;
      case "course":
        return <CourseDetails />;
      default:
        return <p>Select a component</p>;
    }
  };

  const isBook = activeComponent === "book";
  const isBlog = activeComponent === "blog";
  const isCourse = activeComponent === "course";

  return (
    <div className="App">
      <h1>📖 Blogger App</h1>

      {/* Conditional rendering using buttons */}
      <div>
        <button onClick={() => setActiveComponent("book")}>Book</button>
        <button onClick={() => setActiveComponent("blog")}>Blog</button>
        <button onClick={() => setActiveComponent("course")}>Course</button>
      </div>

      <hr />

      {/* 1. Using switch-case (function) */}
      {showComponent()}

      {/* 2. Using ternary operator */}
      {/* {isBook ? <BookDetails /> : isBlog ? <BlogDetails /> : isCourse ? <CourseDetails /> : <p>Nothing selected</p>} */}

      {/* 3. Using && operator */}
      {/* {isBook && <BookDetails />}
      {isBlog && <BlogDetails />}
      {isCourse && <CourseDetails />} */}

    </div>
  );
}

export default App;
