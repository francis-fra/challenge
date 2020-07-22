fun name (input: string option) =
  let val name = case input of 
    NONE => "you" 
    | SOME x => x
  in "One for " ^ name ^  ", one for me."
  end ;
