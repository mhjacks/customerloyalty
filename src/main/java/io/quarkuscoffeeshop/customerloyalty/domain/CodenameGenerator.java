package io.quarkuscoffeeshop.customerloyalty.domain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CodenameGenerator {

    HashMap<String, Set<String>> adjectives = createAdjectives();

    public static String generateCodename() {

        return "FunkyFerret";
    }

    private HashMap<String, Set<String>> createAdjectives(){

        return new HashMap<>() {{
            put("a", new HashSet<String>() {{
                add("Athletic");
                add("Artistic");
                add("Angry");
                add("Able");
                add("Acute");
                add("Adventurous");
                add("Agile");
                add("Aggravated");
                add("Alliterating");
                add("Angelic");
                add("Antsy");
                add("Amazing");
                add("Ambling");
                add("Amenable");
                add("Amicable");
                add("Anarchic");
                add("Annoying");
                add("Antidisestablishmentarian");
                add("Androgynous");
                add("Archaic");
                add("Arty");
                add("Atomic");
                add("Atrophying");
                add("Awesome");
                add("Aware");
                add("Aztec");
                add("Antlered");
            }});
            put("b", new HashSet<>() {{
                add("Batty");
                add("Barking");
                add("Bellicose");
                add("Bewildered");
                add("Blustering");
                add("Boggling");
                add("Boisterous");
                add("Bonkers");
                add("Bounding");
                add("Brainy");
                add("Brave");
                add("Brazen");
                add("Breezy");
                add("Brilliant");
                add("Bright");
                add("Bumpy");
                add("Busy");
            }});
            put("c", new HashSet<>() {{
                add("Calculating");
                add("Callous");
                add("Campy");
                add("Canny");
                add("Canonical");
                add("Careful");
                add("Cavalier");
                add("Celebrating");
                add("Charming");
                add("Cheeky");
                add("Cheerful");
                add("Cheesy");
                add("Chirping");
                add("Chocolate");
                add("Chronic");
                add("Chummy");
                add("Clever");
                add("Clumsy");
                add("Colonel");
                add("Constipated");
                add("Cool");
                add("Courageous");
                add("Crabby");
                add("Crafty");
                add("Cranky");
                add("Crazy");
                add("Crooked");
                add("Cruncy");
                add("Cuddly");
                add("Culpable");
                add("Cunning");
                add("Cute");
                add("Curt");
                add("Cosmic");
            }});
            put("d", new HashSet<>() {{
                add("Dapper");
                add("Dangerous");
                add("Daring");
                add("Dastardly");
                add("Daunting");
                add("Dazzling");
                add("Defiant");
                add("Diligent");
                add("Disaffected");
                add("Disorderly");
                add("Dogmatic");
                add("Dreamy");
                add("Drowsy");
                add("Durable");
                add("Dutiful");

            }});
            put("e", new HashSet<>() {{
                add("Eager");
                add("Early");
                add("Earnest");
                add("Easy");
                add("Eccentric");
                add("Eclectic");
                add("Edgy");
                add("Eerie");
                add("Effervescent");
                add("Electric");
                add("Eminent");
                add("Elegant");
                add("Elite");
                add("Eloquent");
                add("Embraceable");
                add("Enlightened");
                add("Enormous");
                add("Ergonomic");
                add("Erratic");
                add("Euphoric");
                add("Evangelizing");
                add("Exquisite");
                add("Extroverted");

            }});
            put("f", new HashSet<>() {{
                add("Fair");
                add("Fanatical");
                add("Fantastic");
                add("Farsighted");
                add("Fast");
                add("Fatuous");
                add("Fecund");
                add("Feisty");
                add("Festive");
                add("Ferocious");
                add("Fierce");
                add("Fiery");
                add("Fishy");
                add("Flamboyant");
                add("Flakey");
                add("Flashy");
                add("Flippant");
                add("Flirty");
                add("Fluent");
                add("Flying");
                add("Foxy");
                add("Freaky");
                add("Friendly");
                add("Frisky");
                add("Froody");
                add("Fruity");
                add("Functional");
                add("Funky");
                add("Furious");
                add("Furry");
                add("Fuzzy");

            }});
            put("g", new HashSet<>() {{
                add("Gallant");
                add("Galloping");
                add("Gargantuan");
                add("Gelatinous");
                add("Giddy");
                add("Giggling");
                add("Glad");
                add("Gleaming");
                add("Gnathonic");
                add("Gnathal");
                add("Gnostic");
                add("Gooey");
                add("Glorious");
                add("Goofy");
                add("Gorgeous");
                add("Graceful");
                add("Gracious");
                add("Great");
                add("Greedy");
                add("Gregarious");
                add("Grinning");
                add("Gritty");
                add("Grizzly");
                add("Groovy");
                add("Grumpy");
                add("Gutsy");

            }});
            put("h", new HashSet<>() {{
                add("Hairy");
                add("Hairsuite");
                add("Happy");
                add("Hardy");
                add("Haughty");
                add("Hazardous");
                add("Helpful");
                add("Helpless");
                add("Hilarious");
                add("Hippy");
                add("Hoary");
                add("Holy");
                add("Hoopy");
                add("Hopping");
                add("Horned");
                add("Horrible");
                add("Hot");
                add("Howling");
                add("Huge");
                add("Humble");
                add("Humourous");
                add("Hungry");
                add("Hyperactive");

            }});
            put("i", new HashSet<>() {{
                add("Icky");
                add("Icy");
                add("Idyllic");
                add("Iffy");
                add("Igneous");
                add("Ignited");
                add("Illuminating");
                add("Illustrious");
                add("Immodest");
                add("Immortal");
                add("Impish");
                add("Impressive");
                add("Incendiary");
                add("Incomparable");
                add("Inconceivable");
                add("Incontinent");
                add("Incredible");
                add("Incriminatory");
                add("Indefatigable");
                add("Indelible");
                add("Industrious");
                add("Inebriated");
                add("Ineffable");
                add("Inescapable");
                add("Inestimable");
                add("Inevitable");
                add("Inexorable");
                add("Infallible");
                add("Inflammatory");
                add("Inflationary");
                add("Ingenious");
                add("Ingratiating");
                add("Initiatory");
                add("Inky");
                add("Innocent");
                add("Innovatory");
                add("Inquisitive");
                add("Insanitary");
                add("Insatiable");
                add("Inscrutable");
                add("Insightful");
                add("Insolent");
                add("Insouciant");
                add("Inspirational");
                add("Inspired");
                add("Insurgent");
                add("Intelligent");
                add("Interagency");
                add("Intercalary");
                add("Intercessory");
                add("Intercity");
                add("Intermediary");
                add("Interstellar");
                add("Intervarsity");
                add("Intimate");
                add("Intimidated");
                add("Intrepid");
                add("Investigatory");
                add("Irate");
                add("Iridescent");
                add("Irie");
                add("Irksome");
                add("Irrefutable");
                add("Itchy");

            }});
            put("j", new HashSet<>() {{
                add("Jabbering");
                add("Jaded");
                add("Jaundice");
                add("Jaunty");
                add("Jazzy");
                add("Jealous");
                add("Jiggly");
                add("Jinchira");
                add("Jittery");
                add("Jiving");
                add("Jocular");
                add("Jocund");
                add("Jodeling");
                add("Jogging");
                add("Jolly");
                add("Jolted");
                add("Jolty");
                add("Jousting");
                add("Jovial");
                add("Joyous");
                add("Jubilant");
                add("Judicious");
                add("Juggling");
                add("Juicy");
                add("Jumbled");
                add("Jumping");
                add("Jumpity");
                add("Jumpy");
                add("Jungle");
                add("Jungly");
                add("Jurassic");
                add("Juvenile");

            }});
            put("k", new HashSet<>() {{
                add("Kafkaesque");
                add("Kaleidoscopic");
                add("Kamikaze");
                add("Kanny");
                add("Karmic");
                add("Katie");
                add("Kayoed");
                add("Keeking");
                add("Keen");
                add("Keepable");
                add("Kempy");
                add("Khaki");
                add("Kick-ass");
                add("Kicking");
                add("Kicky");
                add("Killer");
                add("Kilted");
                add("Kind");
                add("Kindhearted");
                add("Kinetic");
                add("King-sized");
                add("Kingly");
                add("Kinky");
                add("Kissable");
                add("Kissy");
                add("Kitschy");
                add("Kleptomaniacal");
                add("Klutzy");
                add("Knavish");
                add("Knightly");
                add("Knobby");
                add("Knotty");
                add("Kooky");
                add("Kurt");
                add("Kvetching");
            }});
            put("l", new HashSet<>() {{
                add("Lampooning");
                add("Languid");
                add("Lascivious");
                add("Laudable");
                add("Laughable");
                add("Laughing");
                add("Lazy");
                add("Leaky");
                add("Leal");
                add("Leaping");
                add("Leapy");
                add("Leftist");
                add("Lethal");
                add("Liberal");
                add("Limp");
                add("Lingual");
                add("Listless");
                add("Lithe");
                add("Litigious");
                add("Lively");
                add("Lofty");
                add("Lonely");
                add("Longhorn");
                add("Loopy");
                add("Loquacious");
                add("Lordly");
                add("Lovely");
                add("Lucid");
                add("Lucky");
                add("Lugubrious");
                add("Luminiferous");
                add("Luminous");
                add("Lurid");
                add("Luscious");
                add("Lusty");

            }});
            put("m", new HashSet<>() {{
                add("Macular");
                add("Mad");
                add("Magical");
                add("Magistical");
                add("Magnanimous");
                add("Magnetic");
                add("Magnificent");
                add("Maieutic");
                add("Majestic");
                add("Majim");
                add("Majuscul");
                add("Malapert");
                add("Malicious");
                add("Malodorous");
                add("Malty");
                add("Mammoth");
                add("Mangy");
                add("Manic");
                add("Marauding");
                add("Marvelous");
                add("Massive");
                add("Masterful");
                add("Maudlin");
                add("Maverick");
                add("Mazarine");
                add("Meandering");
                add("Measured");
                add("Meaty");
                add("Melancholic");
                add("Melic");
                add("Melliferous");
                add("Mellifluous");
                add("Mellow");
                add("Melodic");
                add("Melodious");
                add("Memorable");
                add("Menacing");
                add("Menstrual");
                add("Mental");
                add("Mercantile");
                add("Mercenary");
                add("Merciful");
                add("Merciless");
                add("Mercurial");
                add("Meridian");
                add("Merry");
                add("Mesmeric");
                add("Metallic");
                add("Methodic");
                add("Meticulous");
                add("Metric");
                add("Mettled");
                add("Mickle");
                add("Mighty");
                add("Mild");
                add("Militant");
                add("Mindful");
                add("Mini");
                add("Minimalist");
                add("Minty");
                add("Miraculous");
                add("Mischievous");
                add("Misty");
                add("Mobile");
                add("Modest");
                add("Modish");
                add("Momentous");
                add("Monadic");
                add("Monastic");
                add("Monty");
                add("Moonlight");
                add("Moral");
                add("Mordant");
                add("Moxious");
                add("Murphy");
                add("Muscled");
                add("Mushy");
                add("Musical");
                add("Musky");
                add("Muttering");
                add("Myriad");
                add("Mysterious");
                add("Mystic");
                add("Mystical");
                add("Mythical");

            }});
            put("n", new HashSet<>() {{
                add("Nano");
                add("Nasty");
                add("Natty");
                add("Naughty");
                add("Nauseous");
                add("Necrotising");
                add("Nefarious");
                add("Nerdy");
                add("Nested");
                add("Neurotic");
                add("Nifty");
                add("Nimble");
                add("Nippy");
                add("Noble");
                add("Nocturnal");
                add("Nomadic");
                add("Normal");
                add("Normandic");
                add("Nostalgic");
                add("Novel");
                add("Null");
                add("Nutritious");

            }});
            put("o", new HashSet<>() {{
                add("Obedient");
                add("Oblivious");
                add("Obnoxious");
                add("Obsequious");
                add("Observing");
                add("Obstreperous");
                add("Obtuse");
                add("Obverse");
                add("Obvious");
                add("Occult");
                add("Octal");
                add("Octennial");
                add("Odd");
                add("Oily");
                add("Okay");
                add("Omnific");
                add("Omniscient");
                add("Oneiric");
                add("Opportune");
                add("Opportunistic");
                add("Opulent");
                add("Oral");
                add("Orderly");
                add("Ordinary");
                add("Orgasmic");
                add("Orgiastic");
                add("Origamist");
                add("Ornery");
                add("Orthodox");
                add("Orthogenic");
                add("Oscillating");
                add("Ostentatious");

            }});
            put("p", new HashSet<>() {{
                add("Pacific");
                add("Panacean");
                add("Parabolic");
                add("Paradisaic");
                add("Paramount");
                add("Passive");
                add("Peachy");
                add("Pedantic");
                add("Perceptive");
                add("Perennial");
                add("Perky");
                add("Persistent");
                add("Persnickety");
                add("Perverse");
                add("Phantastic");
                add("Phantom");
                add("Phat");
                add("Philantropic");
                add("Philosophical");
                add("Phlegmatic");
                add("Phlegmatic");
                add("Phobic");
                add("Phooka");
                add("Photogenic");
                add("Pickled");
                add("Pimping");
                add("Pink");
                add("Plastered");
                add("Plastic");
                add("Playful");
                add("Plonky");
                add("Plucky");
                add("Plutonic");
                add("Poetic");
                add("Pointy");
                add("Pokey");
                add("Polished");
                add("Polyplastic");
                add("Posh");
                add("Powerful");
                add("Powersaver");
                add("Pragmatic");
                add("Prancing");
                add("Precise");
                add("Precocious");
                add("Predatory");
                add("Predictive");
                add("Predominate");
                add("Prestidigious");
                add("Pretty");
                add("Priapic");
                add("Prickly");
                add("Prideful");
                add("Prissy");
                add("Pristine");
                add("Proactive");
                add("Prolific");
                add("Proud");
                add("Prowly");
                add("Prudent");
                add("Psychedelic");
                add("Psychic");
                add("Pulchritudinous");
                add("Purring");
                add("Pyroclastic");
                add("Pyromaniac");
                add("Pyrotechnic");

            }});
            put("q", new HashSet<>() {{
                add("Quaint");
                add("Quaking");
                add("Quantal");
                add("Quantum");
                add("Quarter");
                add("Queer");
                add("Querulous");
                add("Quick");
                add("Quiet");
                add("Quintessential");
                add("Quirky");
                add("Quivering");
                add("Quixotic");

            }});
            put("r", new HashSet<>() {{
                add("Rabid");
                add("Racey");
                add("Racing");
                add("Radiant");
                add("Radical");
                add("Rambunctious");
                add("Rampant");
                add("Rancid");
                add("Randy");
                add("Rapid");
                add("Raring");
                add("Rational");
                add("Raucous");
                add("Raunchy");
                add("Reasonable");
                add("Rebel");
                add("Rebellious");
                add("Rednosed");
                add("Reminiscent");
                add("Resonant");
                add("Rhapsy");
                add("Ribald");
                add("Rich");
                add("Risky");
                add("Roasted");
                add("Robust");
                add("Rolly");
                add("Rowdy");
                add("Rugged");
                add("Runcible");
                add("Ruthless");

            }});
            put("s", new HashSet<>() {{
                add("Saccate");
                add("Saccharine");
                add("Sagacious");
                add("Sage");
                add("Salivating");
                add("Salubrious");
                add("Sanguine");
                add("Sarcastic");
                add("Sardonic");
                add("Sassy");
                add("Saucy");
                add("Scary");
                add("Scrawny");
                add("Screwy");
                add("Secretive");
                add("Selenographic");
                add("Selenomorphic");
                add("Sensual");
                add("Sentimental");
                add("Serendipitous");
                add("Serious");
                add("Servile");
                add("Severe");
                add("Sexy");
                add("Sharp");
                add("Shiny");
                add("Shrewd");
                add("Silly");
                add("Skinny");
                add("Slick");
                add("Slim");
                add("Slimmy");
                add("Slinky");
                add("Slippery");
                add("Slippy");
                add("Smelly");
                add("Smiling");
                add("Smitten");
                add("Smooth");
                add("Snappy");
                add("Snazzy");
                add("Sneaky");
                add("Soaring");
                add("Solid");
                add("Sophisticated");
                add("Sound");
                add("Spastic");
                add("Special");
                add("Spectacular");
                add("Speedy");
                add("Spicy");
                add("Spooky");
                add("Spotty");
                add("Sprightly");
                add("Spunky");
                add("Squidgy");
                add("Squirly");
                add("Stalwart");
                add("Stealthy");
                add("Stelene");
                add("Steward");
                add("Stocky");
                add("Strapping");
                add("Streetwise");
                add("Stressful");
                add("Striking");
                add("Stunning");
                add("Stupendous");
                add("Sturdy");
                add("Suave");
                add("Suctorial");
                add("Sudden");
                add("Sultry");
                add("Superstitious");
                add("Surreptitious");
                add("Swarthy");

            }});
            put("t", new HashSet<>() {{
                add("Tabby");
                add("Tactful");
                add("Talented");
                add("Tame");
                add("Tantric");
                add("Tangible");
                add("Tangled");
                add("Tanked");
                add("Tasteful");
                add("Tasty");
                add("Taught");
                add("Teachable");
                add("Tedious");
                add("Teeming");
                add("Tempean");
                add("Temperamental");
                add("Temperate");
                add("Tenable");
                add("Tenacious");
                add("Tender");
                add("Terrific");
                add("Thankful");
                add("Therapeutic");
                add("Thorough");
                add("Thoughtful");
                add("Thrashing");
                add("Thrifty");
                add("Thrilled");
                add("Thrilling");
                add("Thriving");
                add("Ticklish");
                add("Tidy");
                add("Tight");
                add("Timely");
                add("Timeless");
                add("Tiny");
                add("Tipsy");
                add("Tireless");
                add("Tolerant");
                add("Touching");
                add("Tough");
                add("Touted");
                add("Trailblazing");
                add("Tranquil");
                add("Transgendered");
                add("Transcendent");
                add("Transcendental");
                add("Transparent");
                add("Traumatized");
                add("Traveled");
                add("Treasured");
                add("Tremendous");
                add("Tretis");
                add("Tricky");
                add("Trim");
                add("Trippy");
                add("Triumphant");
                add("True");
                add("Truculent");
                add("Trusted");
                add("Trustful");
                add("Trustworthy");
                add("Trusty");
                add("Truthful");
                add("Twirling");
                add("Tweaky");
                add("Twitchy");
                add("Tympanic");

            }});
            put("u", new HashSet<>() {{
                add("Ugly");
                add("Ultimate");
                add("Unadulterated");
                add("Unapologetic");
                add("Unassailable");
                add("Unassuming");
                add("Unbelievable");
                add("Ultrarelativistic");
                add("Unctuous");
                add("Underrated");
                add("Underrepresented");
                add("Understanding");
                add("Undulating");
                add("Unplugged");
                add("Unpretentious");
                add("Unrated");
                add("Unrepentant");
                add("Unruly");
                add("Untamed");
                add("Untapped");
                add("Uppity");
                add("Undead");
                add("Uproarious");
                add("Ubiquitous");
                add("Utopic");

            }});
            put("v", new HashSet<>() {{
                add("Valiant");
                add("Vast");
                add("Veracious");
                add("Versatile");
                add("Veteran");
                add("Vibrant");
                add("Violent");
                add("Viral");
                add("Virtuoso");
                add("Vitriolic");
                add("Vivacious");
                add("Vivid");
                add("Vociferous");
                add("Volatile");
                add("Voluptuous");
                add("Vomiting");
                add("Voracious");

            }});
            put("w", new HashSet<>() {{
                add("Wandering");
                add("Warm");
                add("Warty");
                add("Weary");
                add("Weaselly");
                add("Western");
                add("Wild");
                add("Wily");
                add("Wimpy");
                add("Windy");
                add("Witty");
                add("Wobbly");
                add("Wonderful");
                add("Woolly");

            }});
            put("x", new HashSet<>() {{
                add("Xanthic");
                add("Xanthous");
                add("Xenodochial");
                add("Xenolithic");
                add("Xenophobic");
                add("Xenial");
                add("Xeric");
                add("Xerographic");
                add("Xintillating");
                add("Xiphoid");
                add("Xylographic");
                add("Xylophonic");
                add("Xylotomous");

            }});
            put("y", new HashSet<>() {{
                add("Yakkity");
                add("Yammering");
                add("Yelping");
                add("Yippity");
                add("Young");
                add("Youthful");
                add("Yummy");
                add("Yodeling");
                add("Yowling");
            }});
            put("z", new HashSet<>() {{
                add("Zany");
                add("Zealous");
                add("Zen");
                add("Zesty");
                add("Zippy");
                add("Zooming");
                add("Zarking");
            }});

        }};
    }

    private HashMap<String, Set<String>> createAnimals(){
        return new HashMap<>() {{
            put("a", new HashSet<String>() {{

            }});
            put("b", new HashSet<String>() {{

            }});
            put("c", new HashSet<String>() {{

            }});
            put("d", new HashSet<String>() {{

            }});
            put("e", new HashSet<String>() {{

            }});
            put("f", new HashSet<String>() {{

            }});
            put("g", new HashSet<String>() {{

            }});
            put("h", new HashSet<String>() {{

            }});
            put("i", new HashSet<String>() {{

            }});
            put("j", new HashSet<String>() {{

            }});
            put("k", new HashSet<String>() {{

            }});
            put("l", new HashSet<String>() {{

            }});
            put("m", new HashSet<String>() {{

            }});
            put("n", new HashSet<String>() {{

            }});
            put("o", new HashSet<String>() {{

            }});
            put("p", new HashSet<String>() {{

            }});
            put("q", new HashSet<String>() {{

            }});
            put("r", new HashSet<String>() {{

            }});
            put("s", new HashSet<String>() {{

            }});
            put("t", new HashSet<String>() {{

            }});
            put("u", new HashSet<String>() {{

            }});
            put("v", new HashSet<String>() {{

            }});
            put("w", new HashSet<String>() {{

            }});
            put("x", new HashSet<String>() {{

            }});
            put("y", new HashSet<String>() {{

            }});
            put("z", new HashSet<String>() {{

            }});
        }};
    }

}
