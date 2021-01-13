import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void insertionSort(String[] elements) {
        for (int j = 1; j < elements.length; j++) {
            String temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp.compareTo(elements[possibleIndex - 1]) < 0) {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
    }

    public static void main(String[] args) {
        String[] arr1 = { "pen", "fed", "opportunity", "soft", "month", "labor", "hurry", "be", "sport", "exercise",
                "route", "chest", "mud", "saved", "service", "locate", "paint", "possibly", "gather", "blue", "wrong",
                "column", "tide", "pair", "tone", "short", "very", "bad", "slip", "ancient", "pain", "red", "please",
                "welcome", "cast", "call", "finally", "brick", "join", "impossible", "dress", "instrument", "certainly",
                "oil", "compound", "environment", "alive", "stove", "driving", "bite", "piano", "unless", "fifty",
                "lower", "right", "interior", "tea", "flow", "ate", "since", "traffic", "thou", "pool", "hollow",
                "nervous", "general", "bag", "fifteen", "yourself", "add", "package", "space", "youth", "writing",
                "butter", "fish", "steam", "cup", "block", "proud", "stared", "ever", "easily", "also", "pressure",
                "fly", "nobody", "chair", "laugh", "sink", "dropped", "check", "slope", "closer", "shorter", "team",
                "nodded", "writer", "trunk", "sea", "cabin", "own", "party", "share", "instant", "avoid", "shadow",
                "sight", "stuck", "guard", "air", "exact", "camera", "long", "word", "view", "growth", "political",
                "perhaps", "contrast", "film", "themselves", "struck", "rubbed", "blow", "spell", "ordinary", "tried",
                "organized", "nearest", "planned", "pretty", "early", "took", "syllable", "strange", "creature",
                "bicycle", "went", "lesson", "breathe", "there", "pure", "now", "military", "social", "serious", "time",
                "fix", "sets", "shinning", "every", "lunch", "rhythm", "brass", "sail", "kill", "doctor", "wheat",
                "speech", "unknown", "lion", "settlers", "indicate", "claws", "area", "lamp", "bent", "whose", "hill",
                "cannot", "himself", "complete", "stone", "special", "except", "hidden", "swim", "joined", "forest",
                "enjoy", "mile", "troops", "husband", "fact", "taught", "lucky", "allow", "shore", "leg", "neighbor",
                "produce", "half", "car", "combine", "spin", "hold", "brave", "rule", "sat", "according", "tobacco",
                "rather", "type", "physical", "factory", "poet", "appearance", "outside", "tribe", "familiar",
                "wrapped", "likely", "got", "copy", "three", "rising", "somebody", "excellent", "shoe", "favorite",
                "shall", "asleep", "frighten", "lay", "affect", "sale", "rough", "plural", "bank", "show", "clearly",
                "but", "almost", "fort", "earlier", "slide", "coming", "library", "end", "truth", "arm", "thin", "thus",
                "not", "system", "sometime", "useful", "means", "heading", "ruler", "mixture", "pound", "feed", "clock",
                "into", "dirt", "led", "sand", "describe", "probably", "stranger", "been", "bring", "supply", "found",
                "when", "activity", "pine", "stand", "movie", "flies", "badly", "song", "coach", "office", "event",
                "cost", "chart", "label", "provide", "tropical", "massage", "swung", "mirror", "ill", "stood", "women",
                "brought", "dog", "same", "night", "cotton", "port", "once", "did", "include", "excitement", "pink",
                "whom", "story", "series", "face", "curve", "tomorrow", "differ", "black", "threw", "forgotten",
                "correctly", "vowel", "similar", "brief", "bill", "contain", "wind", "you", "basic", "furniture",
                "establish", "hang", "success", "friendly", "mouse", "single", "tune", "near", "refer", "command",
                "balance", "joy", "warn", "steep", "speed", "chance", "classroom", "temperature", "second", "present",
                "angle", "cold", "down", "reader", "truck", "football", "step", "escape", "cat", "hundred", "stop",
                "rose", "helpful", "ahead", "each", "white", "frequently", "fireplace", "halfway", "substance",
                "buffalo", "feet", "consonant", "people", "shot", "weather", "jack", "positive", "everywhere", "ring",
                "carefully", "seen", "dear", "engineer", "garage", "card", "over", "task", "lips", "attack", "hot",
                "tonight", "while", "thing", "from", "break", "barn", "to", "motor", "simplest", "onlinetools", "pony",
                "extra", "happened", "beginning", "recognize", "steady", "simply", "composed", "wherever", "muscle",
                "have", "race", "price", "river", "consist", "chosen", "let", "policeman", "rest", "said", "split",
                "immediately", "sheep", "anywhere", "use", "quickly", "cap", "wash", "dirty", "flame", "friend",
                "stomach", "smallest", "separate", "slave", "men", "daughter", "morning", "occasionally", "method",
                "pack", "government", "least", "major", "represent", "rear", "her", "upon", "solve", "support",
                "before", "solar", "meant", "come", "level", "some", "knowledge", "salmon", "wing", "eleven", "sugar",
                "agree", "pan", "bat", "vertical", "mood", "colony", "today", "family", "put", "lying", "customs",
                "direct", "getting", "cookies", "sheet", "ball", "society", "treated", "region", "deep", "son",
                "related", "hour", "we", "matter", "man", "hardly", "happily", "require", "leaf", "tall", "farmer",
                "held", "author", "must", "nearer", "class", "report", "where", "shake", "open", "feathers", "door",
                "income", "victory", "basket", "master", "track", "past", "by", "fairly", "opposite", "purpose",
                "listen", "fog", "discuss", "food", "shoot", "cell", "vote", "verb", "plane", "drove", "for", "else",
                "floating", "cave", "rate", "neck", "clear", "win", "cook", "vegetable", "wheel", "stick", "told",
                "specific", "accident", "upper", "shade", "examine", "scene", "compare", "suddenly", "branch", "ten",
                "sang", "cross", "log", "just", "moment", "return", "tears", "road", "tube", "explain", "would",
                "finest", "piece", "trick", "crowd", "equipment", "principle", "golden", "its", "experience", "huge",
                "plant", "flag", "tree", "law", "desk", "gate", "element", "clothes", "paper", "enter", "particularly",
                "gave", "tape", "travel", "full", "develop", "sold", "alone", "gasoline", "characteristic", "rush",
                "upward", "bottle", "spring", "during", "flat", "visit", "direction", "sit", "fully", "base", "green",
                "east", "farther", "building", "exciting", "has", "who", "apple", "ship", "afternoon", "want",
                "measure", "walk", "street", "sing", "stock", "maybe", "natural", "excited", "production", "weigh",
                "up", "owner", "dance", "lost", "lungs", "post", "account", "jump", "declared", "bus", "mad", "off",
                "group", "weak", "cutting", "determine", "window", "due", "surprise", "section", "wife", "shoulder",
                "order", "tightly", "eventually", "orbit", "club", "watch", "sign", "slabs", "express", "us", "fourth",
                "whale", "wagon", "realize", "underline", "acres", "apart", "milk", "divide", "arrange", "officer",
                "gift", "front", "made", "box", "shown", "pitch", "mainly", "bet", "battle", "slowly", "glad", "gone",
                "catch", "fifth", "height", "individual", "brush", "shallow", "horse", "blood", "like", "hung", "band",
                "mean", "cent", "boy", "swing", "electric", "music", "active", "magic", "potatoes", "touch", "chapter",
                "lady", "egg", "curious", "swimming", "repeat", "telephone", "name", "making", "hay", "carry",
                "something", "worry", "courage", "deer", "my", "left", "diagram", "wide", "far", "kind", "south", "age",
                "light", "follow", "mission", "apartment", "boat", "believed", "page", "stay", "value", "putting",
                "meet", "strong", "happy", "construction", "rays", "refused", "even", "wall", "depth", "expect",
                "children", "become", "wait", "bar", "tip", "someone", "force", "five", "audience", "happen", "rocky",
                "completely", "our", "length", "sunlight", "snow", "object", "dawn", "broad", "broke", "elephant",
                "definition", "complex", "home", "real", "carried", "act", "equally", "dollar", "ago", "afraid", "late",
                "doll", "poem", "leaving", "headed", "know", "no", "chicken", "lake", "swept", "cattle", "was",
                "company", "beneath", "both", "condition", "browserling", "disappear", "melted", "salt", "this", "him",
                "station", "hurt", "inside", "wood", "gulf", "center", "member", "ready", "small", "eager", "community",
                "heavy", "bee", "having", "met", "grass", "monkey", "experiment", "board", "plenty", "damage", "whom",
                "smile", "fifth", "finger", "student", "outline", "nine", "field", "day", "face", "stems", "fireplace",
                "detail", "ring", "store", "water", "becoming", "country", "measure", "way", "unusual", "gather",
                "feel", "nervous", "sing", "early", "frog", "ship", "in", "me", "barn", "band", "grew", "brave",
                "powerful", "just", "rhyme", "brave", "want", "teach", "perhaps", "shelter", "century", "upon", "trap",
                "first", "successful", "cell", "score", "reader", "report", "desert", "remember", "creature", "said",
                "edge", "provide", "instance", "lift", "six", "bound", "one", "purple", "remarkable", "rapidly", "loss",
                "men", "belt", "browserling", "pool", "task", "especially", "fresh", "enter", "say", "balloon",
                "settlers", "review", "white", "syllable", "pitch", "bright", "live", "month", "difficult", "parallel",
                "zero", "realize", "knife", "herd", "suggest", "log", "arrow", "modern", "instant", "straight",
                "equipment", "production", "since", "north", "bag", "whenever", "dance", "flower", "anywhere", "bar",
                "body", "tropical", "parts", "factor", "kitchen", "poet", "wind", "brave", "nature", "imagine", "best",
                "zero", "desert", "eaten", "gentle", "individual", "being", "century", "those", "men", "plain",
                "frighten", "tower", "world", "cabin", "scientific", "direction", "unusual", "biggest", "open",
                "determine", "hill", "chest", "however", "full", "start", "younger", "afternoon", "development",
                "truck", "allow", "pocket", "save", "sleep", "full", "bank", "queen", "rate", "usually", "kill",
                "death", "curious", "typical", "classroom", "slabs", "faster", "pour", "hall", "reach", "tightly",
                "alike", "back", "duck", "exact", "shout", "shape", "know", "victory", "decide", "we", "division",
                "first", "fighting", "leather", "from", "mental", "division", "coast", "ordinary", "answer", "meal",
                "blew", "hundred", "band", "dry", "watch", "station", "snake", "organized", "did", "bent", "bad",
                "birth", "catch", "prevent", "stairs", "double", "pot", "shut", "activity", "touch", "organization",
                "game", "attempt", "library", "my", "citizen", "dirty", "board", "door", "funny", "comfortable", "cage",
                "means", "exercise", "corn", "body", "nuts", "characteristic", "exercise", "ground", "jack", "shine",
                "noted", "eye", "cap", "habit", "younger", "seed", "exact", "nearer", "broad", "else", "boy", "it",
                "above", "rocky", "correct", "trace", "industry", "easily", "planet", "airplane", "buy", "hole", "hit",
                "motion", "classroom", "sick", "construction", "successful", "well", "asleep", "once", "waste", "sense",
                "low", "possible", "got", "cut", "palace", "ran", "catch", "income", "him", "horse", "pot", "blind",
                "arrive", "friendly", "farmer", "sides", "death", "prove", "pipe", "girl", "roll", "will", "given",
                "pay", "courage", "everyone", "rule", "needed", "scene", "breathe", "usually", "window", "church",
                "meal", "structure", "because", "hot", "sad", "unless", "lamp", "choose", "milk", "more", "lie", "face",
                "wild", "fair", "use", "pain", "cup", "thumb", "save", "suit", "cry", "price", "thread", "line", "we",
                "author", "gain", "older", "dirty", "tightly", "tube", "frighten", "sleep", "disappear", "reader",
                "respect", "drew", "news", "realize", "bark", "shot", "radio", "speed", "breathe", "ask", "was",
                "actually", "suppose", "negative", "motion", "regular", "knowledge", "low", "hello", "offer", "poet",
                "composed", "level", "personal", "alphabet", "cloud", "favorite", "eat", "political", "music", "afraid",
                "art", "year", "truth", "danger", "jump", "summer", "clothing", "cookies", "bear", "putting", "jet",
                "human", "metal", "century", "dirty", "unusual", "brass", "national", "straight", "front", "worry",
                "operation", "taken", "stick", "everywhere", "silver", "load", "happily", "fat", "found", "arrangement",
                "experience", "such", "wherever", "spent", "force", "temperature", "step", "written", "willing",
                "since", "slowly", "bring", "build", "spell", "until", "ask", "how", "strong", "food", "discussion",
                "action", "amount", "perfectly", "seems", "nine", "dress", "travel", "triangle", "effect", "song",
                "eat", "thin", "taught", "plus", "poor", "sum", "breath", "somebody", "asleep", "game", "taken", "bark",
                "range", "production", "wish", "raise", "limited", "met", "major", "fact", "rock", "frog",
                "mathematics", "structure", "possible", "jack", "young", "shelter", "amount", "refer", "bat", "strange",
                "face", "stopped", "town", "spin", "along", "health", "mission", "courage", "jet", "dull", "closer",
                "across", "writing", "land", "worried", "mouth", "lay", "average", "baby", "take", "arm", "bridge",
                "twelve", "born", "perhaps", "driven", "spent", "result", "frequently", "indicate", "canal", "knew",
                "unless", "correct", "grandmother", "alone", "pictured", "came", "one", "law", "are", "should",
                "compound", "remove", "single", "month", "enough", "bent", "got", "indicate", "everywhere", "sink",
                "numeral", "receive", "skill", "gone", "greater", "stand", "ear", "eat", "represent", "disappear", "he",
                "able", "women", "branch", "proper", "sit", "soap", "roll", "little", "serve", "becoming", "bag",
                "aside", "became", "hair", "finally", "judge", "successful", "sometime", "honor", "tropical", "test",
                "pleasant", "walk", "current", "directly", "laugh", "case", "trace", "practical", "swim", "positive",
                "way", "into", "frozen", "press", "layers", "vast", "effort", "choose", "equally", "brave", "silent",
                "typical", "famous", "thought", "alive", "silly", "attempt", "properly", "biggest", "bright",
                "hospital", "captain", "flies", "poetry", "history", "familiar", "determine", "cannot", "share",
                "little", "certainly", "fall", "cast", "property", "remember", "in", "transportation", "unusual",
                "adventure", "string", "slave", "hour", "drop", "everywhere", "quiet", "bush", "balance", "even",
                "simplest", "explanation", "noon", "gasoline", "social", "fairly", "store", "produce", "one", "group",
                "we", "read", "either", "cut", "stopped", "fifth", "asleep", "sold", "chart", "environment", "slave",
                "business", "coffee", "on", "sister", "acres", "teach", "taught", "value", "usual", "more", "tea",
                "wagon", "replace", "whatever", "careful", "physical", "any", "friendly", "both", "sky", "poet",
                "globe", "forgot", "basis", "wealth", "like", "development", "relationship", "acres", "flight", "jar",
                "generally", "eleven", "himself", "rice", "mission", "thus", "eaten", "valuable", "corner", "standard",
                "everything", "nearer", "ruler", "fill", "tobacco", "business", "half", "goes", "disappear", "tune",
                "birds", "accurate", "exercise", "within", "heading", "coming", "sitting", "wire", "chapter", "passage",
                "due", "door", "tired", "afraid", "ancient", "more", "fun", "again", "fight", "six", "almost", "needed",
                "worth", "bent", "square", "statement", "practical", "itself", "rope", "including", "produce", "fish",
                "with", "leaf", "own", "review", "dangerous", "noun", "needle", "understanding", "trap", "hard",
                "figure", "trace", "ran", "lesson", "allow", "brave", "plenty", "cut", "review", "enter", "essential",
                "meant", "tea", "lying", "he", "tail", "tool", "half", "vast", "rate", "loose", "three", "whose",
                "vessels", "sets", "biggest", "loose", "dot", "soft", "climate", "character", "putting", "tune",
                "major", "business", "because", "shells", "slightly", "map", "join", "past", "spread", "tune", "sky",
                "seven", "atomic", "bend", "unknown", "hill", "care", "chose", "anything", "stiff", "afternoon",
                "plural", "basket", "tired", "we", "run", "done", "blew", "manufacturing", "taken", "trap",
                "discussion", "except", "column", "chose", "goes", "thrown", "open", "well", "trick", "act", "date",
                "dog", "pass", "sunlight", "difficulty", "situation", "soap" };

        for (int i = 0; i < arr1.length / 2; i++) {

            swap(arr1, i, arr1.length - (i + 1));
        }

        long startTime = System.nanoTime();
        insertionSort(arr1);
        long endTime = System.nanoTime();
        long insertionSortTime = endTime - startTime;
        System.out.println("\n**Time**");
        System.out.println("Insertion Sort Time: " + insertionSortTime);

        System.out.println(Arrays.toString(arr1));

    }

    private static void swap(String[] myData, int first, int second) {
        String temporary = myData[first];
        myData[first] = myData[second];
        myData[second] = temporary;
    }
}
