use solution::*;

#[test]
fn it_works() {
    let a = 2;
    let b = 3;
    assert_eq!(add(a, b), 5);
}

#[test]
#[ignore]
fn test_add() {
    let a = 8;
    let b = 3;
    assert_eq!(add(a, b), 11);
}