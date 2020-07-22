# run test
elixir rna_transcription_test.exs

# reload
import_file("rna_transcription.exs")
# does not work...?
r("rna_transcription.exs")

# debug
RNATranscription.to_rna('GTA')
# RNATranscription.to_rna(['G', 'T'])
RNATranscription.to_rna('GTA') |> Enum.concat

'GT' |> to_list
?G
to_string ['C', 'A']
['C', 'A'] |> to_string |> to_charlist
# ['C', 'A'] |> to_charlist
List.to_string([?G, ?T])

RNATranscription.dna_complement('G')
RNATranscription.dna_complement(71)
RNATranscription.dna_complement('T')
RNATranscription.dna_complement('C')
RNATranscription.dna_complement('A')

# RNATranscription.dna_complement("T")
# iex -S mix

print = fn(v) -> IO.puts(to_string(v)) end
print_char = fn(v) -> IO.puts(to_charlist(v)) end
id = fn(v) -> v end
str = 'GTA'
to_charlist 'hello'
to_charlist "hello"
to_string 'hello'
'G' |> to_string |> String.graphemes
?G

to_string 'h'
to_charlist 71
'hi'
?G |> to_charlist
to_string 'h'

# to_string str
# str |> String.graphemes
# 'T' |> String.graphemes

Enum.each(str, print_char)
Enum.each(str, print)
Enum.map(str, &RNATranscription.dna_complement/1)

to_string 74

# lst = ['G', 'T']
# String.graphemes('FTG')
# String.to_charlist(str)
# String.next_grapheme(str)
# Enum.map([1,2], fn(x) -> x+ 1 end)