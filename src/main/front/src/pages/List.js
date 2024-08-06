import React from 'react';
import axios from 'axios';
import PostItem from '../components/PostItem';

const List = () => {
  return (
    <div>
      <PostItem />
      <PostItem />
      <PostItem />
      <PostItem />
    </div>
  );
};

export default List;