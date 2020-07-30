const inputCheck = () => {

  const bName = document.getElementById('bName');
  const bTitle = document.getElementById('bTitle');
  const bContent = document.getElementById('bContent');

  if (bName.value === '') {
    alert('이름을 입력하세요.');
    return false;
  }

  if (bTitle.value === '') {
    alert('제목을 입력하세요.');
    return false;
  }
  if (bContent.value === '') {
    alert('내용을 입력하세요.');
    return false;
  }

  return document.getElementById('form').submit();
};
