package graph;
import games.math.Vector2d;
import pacman.MsPacInterface;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Santiago on 27/09/2016.
 */
public class Graph {

    public static int id_pacman;
    public static Node nearest_ghost;


    public static Node blinky;
    public static Node inky;
    public static Node pinky;
    public static Node sue;
    public static Node nearest_pill;
    public static Node nearest_power_pill;
    public static Node nearest_edible;
    public static Node furthest_pill_to_its_nearest_ghost;
    public static Node ghost_nearest_to_the_nearest_power_pill;
    public static int[] pp =new int[4];
    public static int it = 0;
    public static int[] powp1 = new int[12];
    public static int[] powp2= new int[12];
    public static int[] powp3 = new int[12];
    public static int[] powp4 = new int[12];
    public static boolean pp1= false;
    public static boolean pp2= false;
    public static boolean pp3= false;
    public static boolean pp4= false;



    HashMap<Node, Node[]> graph;
    public static HashMap<Vector2d, Node> graphP = new HashMap<>();
    public static Node[] nodes = new Node[755];

    public static void fillGraph() {
        nodes[1]=new Node(1,0,0,new Vector2d(12,36));
        nodes[2]=new Node(2,0,0,new Vector2d(20,36));
        nodes[3]=new Node(3,0,0,new Vector2d(28,36));
        nodes[4]=new Node(4,0,0,new Vector2d(36,36));
        nodes[5]=new Node(5,0,0,new Vector2d(44,36));
        nodes[6]=new Node(6,0,0,new Vector2d(52,36));
        nodes[9]=new Node(9,0,0,new Vector2d(76,36));
        nodes[10]=new Node(10,0,0,new Vector2d(84,36));
        nodes[11]=new Node(11,0,0,new Vector2d(92,36));
        nodes[12]=new Node(12,0,0,new Vector2d(100,36));
        nodes[13]=new Node(13,0,0,new Vector2d(108,36));
        nodes[14]=new Node(14,0,0,new Vector2d(116,36));
        nodes[15]=new Node(15,0,0,new Vector2d(124,36));
        nodes[16]=new Node(16,0,0,new Vector2d(132,36));
        nodes[17]=new Node(17,0,0,new Vector2d(140,36));
        nodes[18]=new Node(18,0,0,new Vector2d(148,36));
        nodes[21]=new Node(21,0,0,new Vector2d(172,36));
        nodes[22]=new Node(22,0,0,new Vector2d(180,36));
        nodes[23]=new Node(23,0,0,new Vector2d(188,36));
        nodes[24]=new Node(24,0,0,new Vector2d(196,36));
        nodes[25]=new Node(25,0,0,new Vector2d(204,36));
        nodes[26]=new Node(26,0,0,new Vector2d(212,36));
        nodes[27]=new Node(27,0,0,new Vector2d(12,44));
        nodes[32]=new Node(32,0,0,new Vector2d(52,44));
        nodes[35]=new Node(35,0,0,new Vector2d(76,44));
        nodes[44]=new Node(44,0,0,new Vector2d(148,44));
        nodes[47]=new Node(47,0,0,new Vector2d(172,44));
        nodes[52]=new Node(52,0,0,new Vector2d(212,44));
        nodes[53]=new Node(53,0,0,new Vector2d(12,52));
        nodes[58]=new Node(58,0,0,new Vector2d(52,52));
        nodes[61]=new Node(61,0,0,new Vector2d(76,52));
        nodes[70]=new Node(70,0,0,new Vector2d(148,52));
        nodes[73]=new Node(73,0,0,new Vector2d(172,52));
        nodes[78]=new Node(78,0,0,new Vector2d(212,52));
        nodes[79]=new Node(79,0,0,new Vector2d(12,60));
        nodes[80]=new Node(80,0,0,new Vector2d(20,60));
        nodes[81]=new Node(81,0,0,new Vector2d(28,60));
        nodes[82]=new Node(82,0,0,new Vector2d(36,60));
        nodes[83]=new Node(83,0,0,new Vector2d(44,60));
        nodes[84]=new Node(84,0,0,new Vector2d(52,60));
        nodes[85]=new Node(85,0,0,new Vector2d(60,60));
        nodes[86]=new Node(86,0,0,new Vector2d(68,60));
        nodes[87]=new Node(87,0,0,new Vector2d(76,60));
        nodes[88]=new Node(88,0,0,new Vector2d(84,60));
        nodes[89]=new Node(89,0,0,new Vector2d(92,60));
        nodes[90]=new Node(90,0,0,new Vector2d(100,60));
        nodes[91]=new Node(91,0,0,new Vector2d(108,60));
        nodes[92]=new Node(92,0,0,new Vector2d(116,60));
        nodes[93]=new Node(93,0,0,new Vector2d(124,60));
        nodes[94]=new Node(94,0,0,new Vector2d(132,60));
        nodes[95]=new Node(95,0,0,new Vector2d(140,60));
        nodes[96]=new Node(96,0,0,new Vector2d(148,60));
        nodes[97]=new Node(97,0,0,new Vector2d(156,60));
        nodes[98]=new Node(98,0,0,new Vector2d(164,60));
        nodes[99]=new Node(99,0,0,new Vector2d(172,60));
        nodes[100]=new Node(100,0,0,new Vector2d(180,60));
        nodes[101]=new Node(101,0,0,new Vector2d(188,60));
        nodes[102]=new Node(102,0,0,new Vector2d(196,60));
        nodes[103]=new Node(103,0,0,new Vector2d(204,60));
        nodes[104]=new Node(104,0,0,new Vector2d(212,60));
        nodes[107]=new Node(107,0,0,new Vector2d(28,68));
        nodes[110]=new Node(110,0,0,new Vector2d(52,68));
        nodes[116]=new Node(116,0,0,new Vector2d(100,68));
        nodes[119]=new Node(119,0,0,new Vector2d(124,68));
        nodes[125]=new Node(125,0,0,new Vector2d(172,68));
        nodes[128]=new Node(128,0,0,new Vector2d(196,68));
        nodes[133]=new Node(133,0,0,new Vector2d(28,76));
        nodes[136]=new Node(136,0,0,new Vector2d(52,76));
        nodes[142]=new Node(142,0,0,new Vector2d(100,76));
        nodes[145]=new Node(145,0,0,new Vector2d(124,76));
        nodes[151]=new Node(151,0,0,new Vector2d(172,76));
        nodes[154]=new Node(154,0,0,new Vector2d(196,76));
        nodes[159]=new Node(159,0,0,new Vector2d(28,84));
        nodes[162]=new Node(162,0,0,new Vector2d(52,84));
        nodes[168]=new Node(168,0,0,new Vector2d(100,84));
        nodes[171]=new Node(171,0,0,new Vector2d(124,84));
        nodes[177]=new Node(177,0,0,new Vector2d(172,84));
        nodes[180]=new Node(180,0,0,new Vector2d(196,84));
        nodes[185]=new Node(185,0,0,new Vector2d(28,92));
        nodes[188]=new Node(188,0,0,new Vector2d(52,92));
        nodes[189]=new Node(189,0,0,new Vector2d(60,92));
        nodes[190]=new Node(190,0,0,new Vector2d(68,92));
        nodes[191]=new Node(191,0,0,new Vector2d(76,92));
        nodes[192]=new Node(192,0,0,new Vector2d(84,92));
        nodes[193]=new Node(193,0,0,new Vector2d(92,92));
        nodes[194]=new Node(194,0,0,new Vector2d(100,92));
        nodes[197]=new Node(197,0,0,new Vector2d(124,92));
        nodes[198]=new Node(198,0,0,new Vector2d(132,92));
        nodes[199]=new Node(199,0,0,new Vector2d(140,92));
        nodes[200]=new Node(200,0,0,new Vector2d(148,92));
        nodes[201]=new Node(201,0,0,new Vector2d(156,92));
        nodes[202]=new Node(202,0,0,new Vector2d(164,92));
        nodes[203]=new Node(203,0,0,new Vector2d(172,92));
        nodes[206]=new Node(206,0,0,new Vector2d(196,92));
        nodes[211]=new Node(211,0,0,new Vector2d(28,100));
        nodes[217]=new Node(217,0,0,new Vector2d(76,100));
        nodes[226]=new Node(226,0,0,new Vector2d(148,100));
        nodes[232]=new Node(232,0,0,new Vector2d(196,100));
        nodes[237]=new Node(237,0,0,new Vector2d(28,108));
        nodes[243]=new Node(243,0,0,new Vector2d(76,108));
        nodes[252]=new Node(252,0,0,new Vector2d(148,108));
        nodes[258]=new Node(258,0,0,new Vector2d(196,108));
        nodes[263]=new Node(263,0,0,new Vector2d(28,116));
        nodes[264]=new Node(264,0,0,new Vector2d(36,116));
        nodes[265]=new Node(265,0,0,new Vector2d(44,116));
        nodes[266]=new Node(266,0,0,new Vector2d(52,116));
        nodes[267]=new Node(267,0,0,new Vector2d(60,116));
        nodes[268]=new Node(268,0,0,new Vector2d(68,116));
        nodes[269]=new Node(269,0,0,new Vector2d(76,116));
        nodes[270]=new Node(270,0,0,new Vector2d(84,116));
        nodes[271]=new Node(271,0,0,new Vector2d(92,116));
        nodes[272]=new Node(272,0,0,new Vector2d(100,116));
        nodes[273]=new Node(273,0,0,new Vector2d(108,116));
        nodes[274]=new Node(274,0,0,new Vector2d(116,116));
        nodes[275]=new Node(275,0,0,new Vector2d(124,116));
        nodes[276]=new Node(276,0,0,new Vector2d(132,116));
        nodes[277]=new Node(277,0,0,new Vector2d(140,116));
        nodes[278]=new Node(278,0,0,new Vector2d(148,116));
        nodes[279]=new Node(279,0,0,new Vector2d(156,116));
        nodes[280]=new Node(280,0,0,new Vector2d(164,116));
        nodes[281]=new Node(281,0,0,new Vector2d(172,116));
        nodes[282]=new Node(282,0,0,new Vector2d(180,116));
        nodes[283]=new Node(283,0,0,new Vector2d(188,116));
        nodes[284]=new Node(284,0,0,new Vector2d(196,116));
        nodes[289]=new Node(289,0,0,new Vector2d(28,124));
        nodes[295]=new Node(295,0,0,new Vector2d(76,124));
        nodes[304]=new Node(304,0,0,new Vector2d(148,124));
        nodes[310]=new Node(310,0,0,new Vector2d(196,124));
        nodes[315]=new Node(315,0,0,new Vector2d(28,132));
        nodes[321]=new Node(321,0,0,new Vector2d(76,132));
        nodes[330]=new Node(330,0,0,new Vector2d(148,132));
        nodes[336]=new Node(336,0,0,new Vector2d(196,132));
        nodes[341]=new Node(341,0,0,new Vector2d(28,140));
        nodes[344]=new Node(344,0,0,new Vector2d(52,140));
        nodes[345]=new Node(345,0,0,new Vector2d(60,140));
        nodes[346]=new Node(346,0,0,new Vector2d(68,140));
        nodes[347]=new Node(347,0,0,new Vector2d(76,140));
        nodes[356]=new Node(356,0,0,new Vector2d(148,140));
        nodes[357]=new Node(357,0,0,new Vector2d(156,140));
        nodes[358]=new Node(358,0,0,new Vector2d(164,140));
        nodes[359]=new Node(359,0,0,new Vector2d(172,140));
        nodes[362]=new Node(362,0,0,new Vector2d(196,140));
        nodes[367]=new Node(367,0,0,new Vector2d(28,148));
        nodes[370]=new Node(370,0,0,new Vector2d(52,148));
        nodes[373]=new Node(373,0,0,new Vector2d(76,148));
        nodes[382]=new Node(382,0,0,new Vector2d(148,148));
        nodes[385]=new Node(385,0,0,new Vector2d(172,148));
        nodes[388]=new Node(388,0,0,new Vector2d(196,148));
        nodes[393]=new Node(393,0,0,new Vector2d(28,156));
        nodes[396]=new Node(396,0,0,new Vector2d(52,156));
        nodes[399]=new Node(399,0,0,new Vector2d(76,156));
        nodes[408]=new Node(408,0,0,new Vector2d(148,156));
        nodes[411]=new Node(411,0,0,new Vector2d(172,156));
        nodes[414]=new Node(414,0,0,new Vector2d(196,156));
        nodes[419]=new Node(419,0,0,new Vector2d(28,164));
        nodes[420]=new Node(420,0,0,new Vector2d(36,164));
        nodes[421]=new Node(421,0,0,new Vector2d(44,164));
        nodes[422]=new Node(422,0,0,new Vector2d(52,164));
        nodes[425]=new Node(425,0,0,new Vector2d(76,164));
        nodes[426]=new Node(426,0,0,new Vector2d(84,164));
        nodes[427]=new Node(427,0,0,new Vector2d(92,164));
        nodes[428]=new Node(428,0,0,new Vector2d(100,164));
        nodes[429]=new Node(429,0,0,new Vector2d(108,164));
        nodes[430]=new Node(430,0,0,new Vector2d(116,164));
        nodes[431]=new Node(431,0,0,new Vector2d(124,164));
        nodes[432]=new Node(432,0,0,new Vector2d(132,164));
        nodes[433]=new Node(433,0,0,new Vector2d(140,164));
        nodes[434]=new Node(434,0,0,new Vector2d(148,164));
        nodes[437]=new Node(437,0,0,new Vector2d(172,164));
        nodes[438]=new Node(438,0,0,new Vector2d(180,164));
        nodes[439]=new Node(439,0,0,new Vector2d(188,164));
        nodes[440]=new Node(440,0,0,new Vector2d(196,164));
        nodes[445]=new Node(445,0,0,new Vector2d(28,172));
        nodes[454]=new Node(454,0,0,new Vector2d(100,172));
        nodes[457]=new Node(457,0,0,new Vector2d(124,172));
        nodes[466]=new Node(466,0,0,new Vector2d(196,172));
        nodes[471]=new Node(471,0,0,new Vector2d(28,180));
        nodes[480]=new Node(480,0,0,new Vector2d(100,180));
        nodes[483]=new Node(483,0,0,new Vector2d(124,180));
        nodes[492]=new Node(492,0,0,new Vector2d(196,180));
        nodes[497]=new Node(497,0,0,new Vector2d(28,188));
        nodes[498]=new Node(498,0,0,new Vector2d(36,188));
        nodes[499]=new Node(499,0,0,new Vector2d(44,188));
        nodes[500]=new Node(500,0,0,new Vector2d(52,188));
        nodes[501]=new Node(501,0,0,new Vector2d(60,188));
        nodes[502]=new Node(502,0,0,new Vector2d(68,188));
        nodes[503]=new Node(503,0,0,new Vector2d(76,188));
        nodes[504]=new Node(504,0,0,new Vector2d(84,188));
        nodes[505]=new Node(505,0,0,new Vector2d(92,188));
        nodes[506]=new Node(506,0,0,new Vector2d(100,188));
        nodes[509]=new Node(509,0,0,new Vector2d(124,188));
        nodes[510]=new Node(510,0,0,new Vector2d(132,188));
        nodes[511]=new Node(511,0,0,new Vector2d(140,188));
        nodes[512]=new Node(512,0,0,new Vector2d(148,188));
        nodes[513]=new Node(513,0,0,new Vector2d(156,188));
        nodes[514]=new Node(514,0,0,new Vector2d(164,188));
        nodes[515]=new Node(515,0,0,new Vector2d(172,188));
        nodes[516]=new Node(516,0,0,new Vector2d(180,188));
        nodes[517]=new Node(517,0,0,new Vector2d(188,188));
        nodes[518]=new Node(518,0,0,new Vector2d(196,188));
        nodes[523]=new Node(523,0,0,new Vector2d(28,196));
        nodes[529]=new Node(529,0,0,new Vector2d(76,196));
        nodes[538]=new Node(538,0,0,new Vector2d(148,196));
        nodes[544]=new Node(544,0,0,new Vector2d(196,196));
        nodes[549]=new Node(549,0,0,new Vector2d(28,204));
        nodes[555]=new Node(555,0,0,new Vector2d(76,204));
        nodes[564]=new Node(564,0,0,new Vector2d(148,204));
        nodes[570]=new Node(570,0,0,new Vector2d(196,204));
        nodes[573]=new Node(573,0,0,new Vector2d(12,212));
        nodes[574]=new Node(574,0,0,new Vector2d(20,212));
        nodes[575]=new Node(575,0,0,new Vector2d(28,212));
        nodes[576]=new Node(576,0,0,new Vector2d(36,212));
        nodes[577]=new Node(577,0,0,new Vector2d(44,212));
        nodes[578]=new Node(578,0,0,new Vector2d(52,212));
        nodes[579]=new Node(579,0,0,new Vector2d(60,212));
        nodes[580]=new Node(580,0,0,new Vector2d(68,212));
        nodes[581]=new Node(581,0,0,new Vector2d(76,212));
        nodes[582]=new Node(582,0,0,new Vector2d(84,212));
        nodes[583]=new Node(583,0,0,new Vector2d(92,212));
        nodes[584]=new Node(584,0,0,new Vector2d(100,212));
        nodes[585]=new Node(585,0,0,new Vector2d(108,212));
        nodes[586]=new Node(586,0,0,new Vector2d(116,212));
        nodes[587]=new Node(587,0,0,new Vector2d(124,212));
        nodes[588]=new Node(588,0,0,new Vector2d(132,212));
        nodes[589]=new Node(589,0,0,new Vector2d(140,212));
        nodes[590]=new Node(590,0,0,new Vector2d(148,212));
        nodes[591]=new Node(591,0,0,new Vector2d(156,212));
        nodes[592]=new Node(592,0,0,new Vector2d(164,212));
        nodes[593]=new Node(593,0,0,new Vector2d(172,212));
        nodes[594]=new Node(594,0,0,new Vector2d(180,212));
        nodes[595]=new Node(595,0,0,new Vector2d(188,212));
        nodes[596]=new Node(596,0,0,new Vector2d(196,212));
        nodes[597]=new Node(597,0,0,new Vector2d(204,212));
        nodes[598]=new Node(598,0,0,new Vector2d(212,212));
        nodes[599]=new Node(599,0,0,new Vector2d(12,220));
        nodes[604]=new Node(604,0,0,new Vector2d(52,220));
        nodes[610]=new Node(610,0,0,new Vector2d(100,220));
        nodes[613]=new Node(613,0,0,new Vector2d(124,220));
        nodes[619]=new Node(619,0,0,new Vector2d(172,220));
        nodes[624]=new Node(624,0,0,new Vector2d(212,220));
        nodes[625]=new Node(625,0,0,new Vector2d(12,228));
        nodes[630]=new Node(630,0,0,new Vector2d(52,228));
        nodes[636]=new Node(636,0,0,new Vector2d(100,228));
        nodes[639]=new Node(639,0,0,new Vector2d(124,228));
        nodes[645]=new Node(645,0,0,new Vector2d(172,228));
        nodes[650]=new Node(650,0,0,new Vector2d(212,228));
        nodes[651]=new Node(651,0,0,new Vector2d(12,236));
        nodes[656]=new Node(656,0,0,new Vector2d(52,236));
        nodes[659]=new Node(659,0,0,new Vector2d(76,236));
        nodes[660]=new Node(660,0,0,new Vector2d(84,236));
        nodes[661]=new Node(661,0,0,new Vector2d(92,236));
        nodes[662]=new Node(662,0,0,new Vector2d(100,236));
        nodes[665]=new Node(665,0,0,new Vector2d(124,236));
        nodes[666]=new Node(666,0,0,new Vector2d(132,236));
        nodes[667]=new Node(667,0,0,new Vector2d(140,236));
        nodes[668]=new Node(668,0,0,new Vector2d(148,236));
        nodes[671]=new Node(671,0,0,new Vector2d(172,236));
        nodes[676]=new Node(676,0,0,new Vector2d(212,236));
        nodes[677]=new Node(677,0,0,new Vector2d(12,244));
        nodes[682]=new Node(682,0,0,new Vector2d(52,244));
        nodes[685]=new Node(685,0,0,new Vector2d(76,244));
        nodes[694]=new Node(694,0,0,new Vector2d(148,244));
        nodes[697]=new Node(697,0,0,new Vector2d(172,244));
        nodes[702]=new Node(702,0,0,new Vector2d(212,244));
        nodes[703]=new Node(703,0,0,new Vector2d(12,252));
        nodes[708]=new Node(708,0,0,new Vector2d(52,252));
        nodes[711]=new Node(711,0,0,new Vector2d(76,252));
        nodes[720]=new Node(720,0,0,new Vector2d(148,252));
        nodes[723]=new Node(723,0,0,new Vector2d(172,252));
        nodes[728]=new Node(728,0,0,new Vector2d(212,252));
        nodes[729]=new Node(729,0,0,new Vector2d(12,260));
        nodes[730]=new Node(730,0,0,new Vector2d(20,260));
        nodes[731]=new Node(731,0,0,new Vector2d(28,260));
        nodes[732]=new Node(732,0,0,new Vector2d(36,260));
        nodes[733]=new Node(733,0,0,new Vector2d(44,260));
        nodes[734]=new Node(734,0,0,new Vector2d(52,260));
        nodes[735]=new Node(735,0,0,new Vector2d(60,260));
        nodes[736]=new Node(736,0,0,new Vector2d(68,260));
        nodes[737]=new Node(737,0,0,new Vector2d(76,260));
        nodes[738]=new Node(738,0,0,new Vector2d(84,260));
        nodes[739]=new Node(739,0,0,new Vector2d(92,260));
        nodes[740]=new Node(740,0,0,new Vector2d(100,260));
        nodes[741]=new Node(741,0,0,new Vector2d(108,260));
        nodes[742]=new Node(742,0,0,new Vector2d(116,260));
        nodes[743]=new Node(743,0,0,new Vector2d(124,260));
        nodes[744]=new Node(744,0,0,new Vector2d(132,260));
        nodes[745]=new Node(745,0,0,new Vector2d(140,260));
        nodes[746]=new Node(746,0,0,new Vector2d(148,260));
        nodes[747]=new Node(747,0,0,new Vector2d(156,260));
        nodes[748]=new Node(748,0,0,new Vector2d(164,260));
        nodes[749]=new Node(749,0,0,new Vector2d(172,260));
        nodes[750]=new Node(750,0,0,new Vector2d(180,260));
        nodes[751]=new Node(751,0,0,new Vector2d(188,260));
        nodes[752]=new Node(752,0,0,new Vector2d(196,260));
        nodes[753]=new Node(753,0,0,new Vector2d(204,260));
        nodes[754]=new Node(754,0,0,new Vector2d(212,260));

        nodes[1].link(nodes[0],nodes[2],nodes[0],nodes[27]);
        nodes[2].link(nodes[1],nodes[3],nodes[0],nodes[0]);
        nodes[3].link(nodes[2],nodes[4],nodes[0],nodes[0]);
        nodes[4].link(nodes[3],nodes[5],nodes[0],nodes[0]);
        nodes[5].link(nodes[4],nodes[6],nodes[0],nodes[0]);
        nodes[6].link(nodes[5],nodes[0],nodes[0],nodes[32]);
        nodes[9].link(nodes[0],nodes[10],nodes[0],nodes[35]);
        nodes[10].link(nodes[9],nodes[11],nodes[0],nodes[0]);
        nodes[11].link(nodes[10],nodes[12],nodes[0],nodes[0]);
        nodes[12].link(nodes[11],nodes[13],nodes[0],nodes[0]);
        nodes[13].link(nodes[12],nodes[14],nodes[0],nodes[0]);
        nodes[14].link(nodes[13],nodes[15],nodes[0],nodes[0]);
        nodes[15].link(nodes[14],nodes[16],nodes[0],nodes[0]);
        nodes[16].link(nodes[15],nodes[17],nodes[0],nodes[0]);
        nodes[17].link(nodes[16],nodes[18],nodes[0],nodes[0]);
        nodes[18].link(nodes[17],nodes[0],nodes[0],nodes[44]);
        nodes[21].link(nodes[0],nodes[22],nodes[0],nodes[47]);
        nodes[22].link(nodes[21],nodes[23],nodes[0],nodes[0]);
        nodes[23].link(nodes[22],nodes[24],nodes[0],nodes[0]);
        nodes[24].link(nodes[23],nodes[25],nodes[0],nodes[0]);
        nodes[25].link(nodes[24],nodes[26],nodes[0],nodes[0]);
        nodes[26].link(nodes[25],nodes[0],nodes[0],nodes[52]);
        nodes[27].link(nodes[0],nodes[0],nodes[1],nodes[53]);
        nodes[32].link(nodes[0],nodes[0],nodes[6],nodes[58]);
        nodes[35].link(nodes[0],nodes[0],nodes[9],nodes[61]);
        nodes[44].link(nodes[0],nodes[0],nodes[18],nodes[70]);
        nodes[47].link(nodes[0],nodes[0],nodes[21],nodes[73]);
        nodes[52].link(nodes[0],nodes[0],nodes[26],nodes[78]);
        nodes[53].link(nodes[0],nodes[0],nodes[27],nodes[79]);
        nodes[58].link(nodes[0],nodes[0],nodes[32],nodes[84]);
        nodes[61].link(nodes[0],nodes[0],nodes[35],nodes[87]);
        nodes[70].link(nodes[0],nodes[0],nodes[44],nodes[96]);
        nodes[73].link(nodes[0],nodes[0],nodes[47],nodes[99]);
        nodes[78].link(nodes[0],nodes[0],nodes[52],nodes[104]);
        nodes[79].link(nodes[0],nodes[80],nodes[53],nodes[0]);
        nodes[80].link(nodes[79],nodes[81],nodes[54],nodes[106]);
        nodes[81].link(nodes[80],nodes[82],nodes[0],nodes[107]);
        nodes[82].link(nodes[81],nodes[83],nodes[0],nodes[0]);
        nodes[83].link(nodes[82],nodes[84],nodes[0],nodes[0]);
        nodes[84].link(nodes[83],nodes[85],nodes[58],nodes[110]);
        nodes[85].link(nodes[84],nodes[86],nodes[0],nodes[0]);
        nodes[86].link(nodes[85],nodes[87],nodes[0],nodes[0]);
        nodes[87].link(nodes[86],nodes[88],nodes[61],nodes[0]);
        nodes[88].link(nodes[87],nodes[89],nodes[0],nodes[0]);
        nodes[89].link(nodes[88],nodes[90],nodes[0],nodes[0]);
        nodes[90].link(nodes[89],nodes[91],nodes[0],nodes[116]);
        nodes[91].link(nodes[90],nodes[92],nodes[0],nodes[0]);
        nodes[92].link(nodes[91],nodes[93],nodes[0],nodes[0]);
        nodes[93].link(nodes[92],nodes[94],nodes[0],nodes[119]);
        nodes[94].link(nodes[93],nodes[95],nodes[0],nodes[0]);
        nodes[95].link(nodes[94],nodes[96],nodes[0],nodes[0]);
        nodes[96].link(nodes[95],nodes[97],nodes[70],nodes[0]);
        nodes[97].link(nodes[96],nodes[98],nodes[0],nodes[0]);
        nodes[98].link(nodes[97],nodes[99],nodes[0],nodes[0]);
        nodes[99].link(nodes[98],nodes[100],nodes[73],nodes[125]);
        nodes[100].link(nodes[99],nodes[101],nodes[0],nodes[0]);
        nodes[101].link(nodes[100],nodes[102],nodes[0],nodes[0]);
        nodes[102].link(nodes[101],nodes[103],nodes[0],nodes[128]);
        nodes[103].link(nodes[102],nodes[104],nodes[0],nodes[0]);
        nodes[104].link(nodes[103],nodes[0],nodes[78],nodes[0]);
        nodes[107].link(nodes[0],nodes[0],nodes[81],nodes[133]);
        nodes[110].link(nodes[0],nodes[0],nodes[84],nodes[136]);
        nodes[116].link(nodes[0],nodes[0],nodes[90],nodes[142]);
        nodes[119].link(nodes[0],nodes[0],nodes[93],nodes[145]);
        nodes[125].link(nodes[0],nodes[0],nodes[99],nodes[151]);
        nodes[128].link(nodes[0],nodes[0],nodes[102],nodes[154]);
        nodes[133].link(nodes[0],nodes[0],nodes[107],nodes[159]);
        nodes[136].link(nodes[0],nodes[0],nodes[110],nodes[162]);
        nodes[142].link(nodes[0],nodes[0],nodes[116],nodes[168]);
        nodes[145].link(nodes[0],nodes[0],nodes[119],nodes[171]);
        nodes[151].link(nodes[0],nodes[0],nodes[125],nodes[177]);
        nodes[154].link(nodes[0],nodes[0],nodes[128],nodes[180]);
        nodes[159].link(nodes[0],nodes[0],nodes[133],nodes[185]);
        nodes[162].link(nodes[0],nodes[0],nodes[136],nodes[188]);
        nodes[168].link(nodes[0],nodes[0],nodes[142],nodes[194]);
        nodes[171].link(nodes[0],nodes[0],nodes[145],nodes[197]);
        nodes[177].link(nodes[0],nodes[0],nodes[151],nodes[203]);
        nodes[180].link(nodes[0],nodes[0],nodes[154],nodes[206]);
        nodes[185].link(nodes[206],nodes[0],nodes[159],nodes[211]);
        nodes[188].link(nodes[0],nodes[189],nodes[162],nodes[0]);
        nodes[189].link(nodes[188],nodes[190],nodes[0],nodes[0]);
        nodes[190].link(nodes[189],nodes[191],nodes[0],nodes[0]);
        nodes[191].link(nodes[190],nodes[192],nodes[0],nodes[217]);
        nodes[192].link(nodes[191],nodes[193],nodes[0],nodes[0]);
        nodes[193].link(nodes[192],nodes[194],nodes[0],nodes[0]);
        nodes[194].link(nodes[193],nodes[0],nodes[168],nodes[0]);
        nodes[197].link(nodes[0],nodes[198],nodes[171],nodes[0]);
        nodes[198].link(nodes[197],nodes[199],nodes[0],nodes[0]);
        nodes[199].link(nodes[198],nodes[200],nodes[0],nodes[0]);
        nodes[200].link(nodes[199],nodes[201],nodes[0],nodes[226]);
        nodes[201].link(nodes[200],nodes[202],nodes[0],nodes[0]);
        nodes[202].link(nodes[201],nodes[203],nodes[0],nodes[0]);
        nodes[203].link(nodes[202],nodes[0],nodes[177],nodes[0]);
        nodes[206].link(nodes[0],nodes[185],nodes[180],nodes[232]);
        nodes[211].link(nodes[0],nodes[0],nodes[185],nodes[237]);
        nodes[217].link(nodes[0],nodes[0],nodes[191],nodes[243]);
        nodes[226].link(nodes[0],nodes[0],nodes[200],nodes[252]);
        nodes[232].link(nodes[0],nodes[0],nodes[206],nodes[258]);
        nodes[237].link(nodes[0],nodes[0],nodes[211],nodes[263]);
        nodes[243].link(nodes[0],nodes[0],nodes[217],nodes[269]);
        nodes[252].link(nodes[0],nodes[0],nodes[226],nodes[278]);
        nodes[258].link(nodes[0],nodes[0],nodes[232],nodes[284]);
        nodes[263].link(nodes[0],nodes[264],nodes[237],nodes[289]);
        nodes[264].link(nodes[263],nodes[265],nodes[0],nodes[0]);
        nodes[265].link(nodes[264],nodes[266],nodes[0],nodes[0]);
        nodes[266].link(nodes[265],nodes[267],nodes[0],nodes[0]);
        nodes[267].link(nodes[266],nodes[268],nodes[0],nodes[0]);
        nodes[268].link(nodes[267],nodes[269],nodes[0],nodes[0]);
        nodes[269].link(nodes[268],nodes[270],nodes[243],nodes[295]);
        nodes[270].link(nodes[269],nodes[271],nodes[0],nodes[0]);
        nodes[271].link(nodes[270],nodes[272],nodes[0],nodes[0]);
        nodes[272].link(nodes[271],nodes[273],nodes[0],nodes[0]);
        nodes[273].link(nodes[272],nodes[274],nodes[0],nodes[0]);
        nodes[274].link(nodes[273],nodes[275],nodes[0],nodes[0]);
        nodes[275].link(nodes[274],nodes[276],nodes[0],nodes[0]);
        nodes[276].link(nodes[275],nodes[277],nodes[0],nodes[0]);
        nodes[277].link(nodes[276],nodes[278],nodes[0],nodes[0]);
        nodes[278].link(nodes[277],nodes[279],nodes[252],nodes[304]);
        nodes[279].link(nodes[278],nodes[280],nodes[0],nodes[0]);
        nodes[280].link(nodes[279],nodes[281],nodes[0],nodes[0]);
        nodes[281].link(nodes[280],nodes[282],nodes[0],nodes[0]);
        nodes[282].link(nodes[281],nodes[283],nodes[0],nodes[0]);
        nodes[283].link(nodes[282],nodes[284],nodes[0],nodes[0]);
        nodes[284].link(nodes[283],nodes[0],nodes[258],nodes[310]);
        nodes[289].link(nodes[0],nodes[0],nodes[263],nodes[315]);
        nodes[295].link(nodes[0],nodes[0],nodes[269],nodes[321]);
        nodes[304].link(nodes[0],nodes[0],nodes[278],nodes[330]);
        nodes[310].link(nodes[0],nodes[0],nodes[284],nodes[336]);
        nodes[315].link(nodes[0],nodes[0],nodes[289],nodes[341]);
        nodes[321].link(nodes[0],nodes[0],nodes[295],nodes[347]);
        nodes[330].link(nodes[0],nodes[0],nodes[304],nodes[356]);
        nodes[336].link(nodes[0],nodes[0],nodes[310],nodes[362]);
        nodes[341].link(nodes[0],nodes[0],nodes[315],nodes[367]);
        nodes[344].link(nodes[0],nodes[345],nodes[0],nodes[370]);
        nodes[345].link(nodes[344],nodes[346],nodes[0],nodes[0]);
        nodes[346].link(nodes[345],nodes[347],nodes[0],nodes[0]);
        nodes[347].link(nodes[346],nodes[0],nodes[321],nodes[373]);
        nodes[356].link(nodes[0],nodes[357],nodes[330],nodes[382]);
        nodes[357].link(nodes[356],nodes[358],nodes[0],nodes[0]);
        nodes[358].link(nodes[357],nodes[359],nodes[0],nodes[0]);
        nodes[359].link(nodes[358],nodes[0],nodes[0],nodes[385]);
        nodes[362].link(nodes[0],nodes[0],nodes[336],nodes[388]);
        nodes[367].link(nodes[0],nodes[0],nodes[341],nodes[393]);
        nodes[370].link(nodes[0],nodes[0],nodes[344],nodes[396]);
        nodes[373].link(nodes[0],nodes[0],nodes[347],nodes[399]);
        nodes[382].link(nodes[0],nodes[0],nodes[356],nodes[408]);
        nodes[385].link(nodes[0],nodes[0],nodes[359],nodes[411]);
        nodes[388].link(nodes[0],nodes[0],nodes[362],nodes[414]);
        nodes[393].link(nodes[0],nodes[0],nodes[367],nodes[419]);
        nodes[396].link(nodes[0],nodes[0],nodes[370],nodes[422]);
        nodes[399].link(nodes[0],nodes[0],nodes[373],nodes[425]);
        nodes[408].link(nodes[0],nodes[0],nodes[382],nodes[434]);
        nodes[411].link(nodes[0],nodes[0],nodes[385],nodes[437]);
        nodes[414].link(nodes[0],nodes[0],nodes[388],nodes[440]);
        nodes[419].link(nodes[440],nodes[420],nodes[393],nodes[445]);
        nodes[420].link(nodes[419],nodes[421],nodes[0],nodes[0]);
        nodes[421].link(nodes[420],nodes[422],nodes[0],nodes[0]);
        nodes[422].link(nodes[421],nodes[0],nodes[396],nodes[0]);
        nodes[425].link(nodes[0],nodes[426],nodes[399],nodes[0]);
        nodes[426].link(nodes[425],nodes[427],nodes[0],nodes[0]);
        nodes[427].link(nodes[426],nodes[428],nodes[0],nodes[0]);
        nodes[428].link(nodes[427],nodes[429],nodes[0],nodes[454]);
        nodes[429].link(nodes[428],nodes[430],nodes[0],nodes[0]);
        nodes[430].link(nodes[429],nodes[431],nodes[0],nodes[0]);
        nodes[431].link(nodes[430],nodes[432],nodes[0],nodes[457]);
        nodes[432].link(nodes[431],nodes[433],nodes[0],nodes[0]);
        nodes[433].link(nodes[432],nodes[434],nodes[0],nodes[0]);
        nodes[434].link(nodes[433],nodes[0],nodes[408],nodes[0]);
        nodes[437].link(nodes[0],nodes[438],nodes[411],nodes[0]);
        nodes[438].link(nodes[437],nodes[439],nodes[0],nodes[0]);
        nodes[439].link(nodes[438],nodes[440],nodes[0],nodes[0]);
        nodes[440].link(nodes[439],nodes[419],nodes[414],nodes[466]);
        nodes[445].link(nodes[0],nodes[0],nodes[419],nodes[471]);
        nodes[454].link(nodes[0],nodes[0],nodes[428],nodes[480]);
        nodes[457].link(nodes[0],nodes[0],nodes[431],nodes[483]);
        nodes[466].link(nodes[0],nodes[0],nodes[440],nodes[492]);
        nodes[471].link(nodes[0],nodes[0],nodes[445],nodes[497]);
        nodes[480].link(nodes[0],nodes[0],nodes[454],nodes[506]);
        nodes[483].link(nodes[0],nodes[0],nodes[457],nodes[509]);
        nodes[492].link(nodes[0],nodes[0],nodes[466],nodes[518]);
        nodes[497].link(nodes[0],nodes[498],nodes[471],nodes[523]);
        nodes[498].link(nodes[497],nodes[499],nodes[0],nodes[0]);
        nodes[499].link(nodes[498],nodes[500],nodes[0],nodes[0]);
        nodes[500].link(nodes[499],nodes[501],nodes[0],nodes[0]);
        nodes[501].link(nodes[500],nodes[502],nodes[0],nodes[0]);
        nodes[502].link(nodes[501],nodes[503],nodes[0],nodes[0]);
        nodes[503].link(nodes[502],nodes[504],nodes[0],nodes[529]);
        nodes[504].link(nodes[503],nodes[505],nodes[0],nodes[0]);
        nodes[505].link(nodes[504],nodes[506],nodes[0],nodes[0]);
        nodes[506].link(nodes[505],nodes[0],nodes[480],nodes[0]);
        nodes[509].link(nodes[0],nodes[510],nodes[483],nodes[0]);
        nodes[510].link(nodes[509],nodes[511],nodes[0],nodes[0]);
        nodes[511].link(nodes[510],nodes[512],nodes[0],nodes[0]);
        nodes[512].link(nodes[511],nodes[513],nodes[0],nodes[538]);
        nodes[513].link(nodes[512],nodes[514],nodes[0],nodes[0]);
        nodes[514].link(nodes[513],nodes[515],nodes[0],nodes[0]);
        nodes[515].link(nodes[514],nodes[516],nodes[0],nodes[0]);
        nodes[516].link(nodes[515],nodes[517],nodes[0],nodes[0]);
        nodes[517].link(nodes[516],nodes[518],nodes[0],nodes[0]);
        nodes[518].link(nodes[517],nodes[0],nodes[492],nodes[544]);
        nodes[523].link(nodes[0],nodes[0],nodes[497],nodes[549]);
        nodes[529].link(nodes[0],nodes[0],nodes[503],nodes[555]);
        nodes[538].link(nodes[0],nodes[0],nodes[512],nodes[564]);
        nodes[544].link(nodes[0],nodes[0],nodes[518],nodes[570]);
        nodes[549].link(nodes[0],nodes[0],nodes[523],nodes[575]);
        nodes[555].link(nodes[0],nodes[0],nodes[529],nodes[581]);
        nodes[564].link(nodes[0],nodes[0],nodes[538],nodes[590]);
        nodes[570].link(nodes[0],nodes[0],nodes[544],nodes[596]);
        nodes[573].link(nodes[0],nodes[574],nodes[0],nodes[599]);
        nodes[574].link(nodes[573],nodes[575],nodes[0],nodes[0]);
        nodes[575].link(nodes[574],nodes[576],nodes[549],nodes[0]);
        nodes[576].link(nodes[575],nodes[577],nodes[0],nodes[0]);
        nodes[577].link(nodes[576],nodes[578],nodes[0],nodes[0]);
        nodes[578].link(nodes[577],nodes[579],nodes[0],nodes[604]);
        nodes[579].link(nodes[578],nodes[580],nodes[0],nodes[0]);
        nodes[580].link(nodes[579],nodes[581],nodes[0],nodes[0]);
        nodes[581].link(nodes[580],nodes[582],nodes[555],nodes[0]);
        nodes[582].link(nodes[581],nodes[583],nodes[0],nodes[0]);
        nodes[583].link(nodes[582],nodes[584],nodes[0],nodes[0]);
        nodes[584].link(nodes[583],nodes[585],nodes[0],nodes[610]);
        nodes[585].link(nodes[584],nodes[586],nodes[0],nodes[0]);
        nodes[586].link(nodes[585],nodes[587],nodes[0],nodes[0]);
        nodes[587].link(nodes[586],nodes[588],nodes[0],nodes[613]);
        nodes[588].link(nodes[587],nodes[589],nodes[0],nodes[0]);
        nodes[589].link(nodes[588],nodes[590],nodes[0],nodes[0]);
        nodes[590].link(nodes[589],nodes[591],nodes[564],nodes[0]);
        nodes[591].link(nodes[590],nodes[592],nodes[0],nodes[0]);
        nodes[592].link(nodes[591],nodes[593],nodes[0],nodes[0]);
        nodes[593].link(nodes[592],nodes[594],nodes[0],nodes[619]);
        nodes[594].link(nodes[593],nodes[595],nodes[0],nodes[0]);
        nodes[595].link(nodes[594],nodes[596],nodes[0],nodes[0]);
        nodes[596].link(nodes[595],nodes[597],nodes[570],nodes[0]);
        nodes[597].link(nodes[596],nodes[598],nodes[0],nodes[0]);
        nodes[598].link(nodes[597],nodes[0],nodes[0],nodes[624]);
        nodes[599].link(nodes[0],nodes[0],nodes[573],nodes[625]);
        nodes[604].link(nodes[0],nodes[0],nodes[578],nodes[630]);
        nodes[610].link(nodes[0],nodes[0],nodes[584],nodes[636]);
        nodes[613].link(nodes[0],nodes[0],nodes[587],nodes[639]);
        nodes[619].link(nodes[0],nodes[0],nodes[593],nodes[645]);
        nodes[624].link(nodes[0],nodes[0],nodes[598],nodes[650]);
        nodes[625].link(nodes[0],nodes[0],nodes[599],nodes[651]);
        nodes[630].link(nodes[0],nodes[0],nodes[604],nodes[656]);
        nodes[636].link(nodes[0],nodes[0],nodes[610],nodes[662]);
        nodes[639].link(nodes[0],nodes[0],nodes[613],nodes[665]);
        nodes[645].link(nodes[0],nodes[0],nodes[619],nodes[671]);
        nodes[650].link(nodes[0],nodes[0],nodes[624],nodes[676]);
        nodes[651].link(nodes[0],nodes[0],nodes[625],nodes[677]);
        nodes[656].link(nodes[0],nodes[0],nodes[630],nodes[682]);
        nodes[659].link(nodes[0],nodes[660],nodes[0],nodes[685]);
        nodes[660].link(nodes[659],nodes[661],nodes[0],nodes[0]);
        nodes[661].link(nodes[660],nodes[662],nodes[0],nodes[0]);
        nodes[662].link(nodes[661],nodes[0],nodes[636],nodes[0]);
        nodes[665].link(nodes[0],nodes[666],nodes[639],nodes[0]);
        nodes[666].link(nodes[665],nodes[667],nodes[0],nodes[0]);
        nodes[667].link(nodes[666],nodes[668],nodes[0],nodes[0]);
        nodes[668].link(nodes[667],nodes[0],nodes[0],nodes[694]);
        nodes[671].link(nodes[0],nodes[0],nodes[645],nodes[697]);
        nodes[676].link(nodes[0],nodes[0],nodes[650],nodes[702]);
        nodes[677].link(nodes[0],nodes[0],nodes[651],nodes[703]);
        nodes[682].link(nodes[0],nodes[0],nodes[656],nodes[708]);
        nodes[685].link(nodes[0],nodes[0],nodes[659],nodes[711]);
        nodes[694].link(nodes[0],nodes[0],nodes[668],nodes[720]);
        nodes[697].link(nodes[0],nodes[0],nodes[671],nodes[723]);
        nodes[702].link(nodes[0],nodes[0],nodes[676],nodes[728]);
        nodes[703].link(nodes[0],nodes[0],nodes[677],nodes[729]);
        nodes[708].link(nodes[0],nodes[0],nodes[682],nodes[734]);
        nodes[711].link(nodes[0],nodes[0],nodes[685],nodes[737]);
        nodes[720].link(nodes[0],nodes[0],nodes[694],nodes[746]);
        nodes[723].link(nodes[0],nodes[0],nodes[697],nodes[749]);
        nodes[728].link(nodes[0],nodes[0],nodes[702],nodes[754]);
        nodes[729].link(nodes[0],nodes[730],nodes[703],nodes[0]);
        nodes[730].link(nodes[729],nodes[731],nodes[0],nodes[0]);
        nodes[731].link(nodes[730],nodes[732],nodes[0],nodes[0]);
        nodes[732].link(nodes[731],nodes[733],nodes[0],nodes[0]);
        nodes[733].link(nodes[732],nodes[734],nodes[0],nodes[0]);
        nodes[734].link(nodes[733],nodes[735],nodes[708],nodes[0]);
        nodes[735].link(nodes[734],nodes[736],nodes[0],nodes[0]);
        nodes[736].link(nodes[735],nodes[737],nodes[0],nodes[0]);
        nodes[737].link(nodes[736],nodes[738],nodes[711],nodes[0]);
        nodes[738].link(nodes[737],nodes[739],nodes[0],nodes[0]);
        nodes[739].link(nodes[738],nodes[740],nodes[0],nodes[0]);
        nodes[740].link(nodes[739],nodes[741],nodes[0],nodes[0]);
        nodes[741].link(nodes[740],nodes[742],nodes[0],nodes[0]);
        nodes[742].link(nodes[741],nodes[743],nodes[0],nodes[0]);
        nodes[743].link(nodes[742],nodes[744],nodes[0],nodes[0]);
        nodes[744].link(nodes[743],nodes[745],nodes[0],nodes[0]);
        nodes[745].link(nodes[744],nodes[746],nodes[0],nodes[0]);
        nodes[746].link(nodes[745],nodes[747],nodes[720],nodes[0]);
        nodes[747].link(nodes[746],nodes[748],nodes[0],nodes[0]);
        nodes[748].link(nodes[747],nodes[749],nodes[0],nodes[0]);
        nodes[749].link(nodes[748],nodes[750],nodes[723],nodes[0]);
        nodes[750].link(nodes[749],nodes[751],nodes[0],nodes[0]);
        nodes[751].link(nodes[750],nodes[752],nodes[0],nodes[0]);
        nodes[752].link(nodes[751],nodes[753],nodes[0],nodes[0]);
        nodes[753].link(nodes[752],nodes[754],nodes[0],nodes[0]);
        nodes[754].link(nodes[753],nodes[0],nodes[728],nodes[0]);

        for (Node x : nodes) {
//            System.out.println("nodos" + i);
            if (x != null) {
                graphP.put(x.pos, x);
            }
        }
//        System.out.println(graphP);

        pp[0] = 677;
        pp[1] = 702;
        pp[2] = 52;
        pp[3] = 27;
    }

    public static void reset(){
        for(Node x : graphP.values()){
            x.setElement(0);
        }
    }

    public static void update(){



        if (it < 12){
            powp1[it]= Graph.nodes[677].element;
            powp2[it]= Graph.nodes[702].element;
            powp3[it]= Graph.nodes[52].element;
            powp4[it]= Graph.nodes[27].element;
            it++;
        }else{
            it = 0;
            for (int i = 0 ; i<12; i++){
                if (powp1[i]==999){
                    pp1=true;
                    break;
                }
                pp1 = false;
            }
            for (int i = 0 ; i<12; i++){
                if (powp2[i]==999){
                    pp2=true;
                    break;
                }
                pp2 = false;
            }
            for (int i = 0 ; i<12; i++){
                if (powp3[i]==999){
                    pp3=true;
                    break;
                }
                pp3 = false;
            }
            for (int i = 0 ; i<12; i++){
                if (powp4[i]==999){
                    pp4=true;
                    break;
                }
                pp4 = false;
            }
        }



        for(Node x: graphP.values()){
            if(x.element== -256){
                id_pacman= x.id;
            }

        }
        if (Graph.nodes[id_pacman]!=null){
            BFS u=new BFS(Graph.nodes[id_pacman]);
            nearest_pill=u.bfs(-2434305);
            nearest_edible=u.bfs(-14408449);
            nearest_ghost=u.bfs(-65536,-18689,-16711681,-18859);
            blinky = u.bfs(-65536);
            inky = u.bfs(-18689);
            pinky = u.bfs(-16711681);
            sue = u.bfs(-18859);

//            static int blinky = -65536;
//            static int pinky = -18689;
//            static int inky = -16711681;
//            static int sue = -18859;
            //System.out.println(Graph.nodes[id_pacman].id);
         /*   for (int i = 0; i < 4; i++){
                //System.out.println(Graph.nodes[id_pacman].id);
                if (pp[i] == id_pacman){
                    pp[i]=-1;
                }

        }*/

            //for (int i = 0; i < 4; i++){

              //  }

            //System.out.println(Graph.nodes[pp[0]].element);

        }


    }



    public static void printGraph(){
        int [][]g = new int[29][26];

        for(int i = 0 ; i < 29; i++){
            for ( int j = 0 ; j < 26 ; j++){
                if(graphP.containsKey(new Vector2d(12+(j*8),36+(i*8) ))){
                    g[i][j] = graphP.get(new Vector2d(12+(j*8),36+(i*8) )).element;
                }else {
                    g[i][j] = 0;
                }
            }
        }


        for (int i = 0 ; i < 29 ; i++){
            for (int  j = 0 ; j < 26 ; j++){

                if(g[i][j] == -256){
                    System.out.print(":V ");
                }
                if(g[i][j] == -2434305){
                    System.out.print("p ");
                }
                if(g[i][j] == 0){
                    System.out.print("- ");
                }
                if(g[i][j] == -65536){
                    System.out.print("B ");
                }
                if(g[i][j] == -18689){
                    System.out.print("L ");
                }if(g[i][j] == -16711681){
                    System.out.print("O ");
                }if(g[i][j] == -18859){
                    System.out.print("G ");
                }if(g[i][j] == -14408449){
                    System.out.print("W ");
                }

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_____________________________________________________________________________");
        System.out.println();

    }
}
