open OUnit2
open P01

(* let ae exp got _test_ctxt = assert_equal exp got ~printer:string_of_bool *)
(* let ae exp got _test_ctxt = assert_equal ~printer:(fun x -> x) exp got *)

let tests = [
    "echo" >:: (fun _ -> assert_equal 5 (sum_multiples 5));
]

let () =
  run_test_tt_main ("leap tests" >::: tests)