import React from 'react';
import Post from './Post';

export default class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  // Step 6: Fetch API
  loadPosts() {
  fetch('https://jsonplaceholder.typicode.com/posts')
    .then((response) => response.json())
    .then((data) => this.setState({ posts: data }))
    .catch((error) => {
      console.error("Error fetching posts:", error);
      this.setState({ hasError: true });
    });
}


  // Step 7: Lifecycle Hook
  componentDidMount() {
    this.loadPosts();
  }

  // Step 9: Error boundary
  componentDidCatch(error, info) {
    alert('An error occurred: ' + error.message);
    console.error("Error Info:", info);
  }

  // Step 8: Render Method
  render() {
    console.log(this.state.posts);

    return (
      <div style={{ padding: '20px' }}>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}
