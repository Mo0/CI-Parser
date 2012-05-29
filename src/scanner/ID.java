package scanner;

public enum ID {
	MUL(256),PLUS(257),MINUS(258),DIV(259),ASSIGN(260),EQ(261),NEQ(262),LO(263),DO(295),
	LOEQ(264),HI(265),HIEQ(267),DOT(268),COMMA(269),COLON(270),LPAR(271),RPAR(272),
	LBRAC(273),RBRAC(274),SEMICOLON(275),OF(276),THEN(277),PRINT(278),READ(279),END(280),
	ELSE(281),ELSIF(282),IF(283),WHILE(284),REPEAT(285),UNTIL(286),ARRAY(287),RECORD(288),
	CONST(289),TYPE(290),VAR(291),PROCEDURE(292),BEGIN(293),MODULE(294),ID(295),DIGIT(296),
	ERROR(297),BLANK(298),QUOT(299);

    private final int id;
    ID (int id) { this.id = id; }
    public int getValue() { return id; }
}