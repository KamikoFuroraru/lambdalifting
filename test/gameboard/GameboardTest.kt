package gameboard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GameboardTest {
    @Test
    fun test() {
        val gameboardContest1 = Gameboard("maps/contest1.map")
        gameboardContest1.act("DLLDDRRLULLDL")
        assertEquals(212, gameboardContest1.getScore())
        assertEquals(Gameboard.State.WON, gameboardContest1.getState())

        val gameboardContest2 = Gameboard("maps/contest2.map")
        gameboardContest2.act("RRUDRRULURULLLLDDDL")
        assertEquals(281, gameboardContest2.getScore())
        assertEquals(Gameboard.State.WON, gameboardContest2.getState())

        val gameboardContest3 = Gameboard("maps/contest3.map")
        gameboardContest3.act("LDDDRRRRDDLLLLLDURRRUURRR")
        assertEquals(275, gameboardContest3.getScore())
        assertEquals(Gameboard.State.WON, gameboardContest1.getState())

        val gameboardBeard1 = Gameboard("maps/beard1.map")
        gameboardBeard1.act("RDLRUURRRRRDDDUULLDDDDLLLLLDDRURSURURRUURRDDDR")
        assertEquals(854, gameboardBeard1.getScore())
        assertEquals(Gameboard.State.WON, gameboardBeard1.getState())

        val gameboardBeard2 = Gameboard("maps/beard2.map")
        gameboardBeard2.act("DDRRRRRRRRRRRRRRRRRRRRRRRRRRDDDLLRDDDDDLLLUUUUULLDDDDRDLLLUUULRDDDLLLUUURULUDLLDLDDRRDLLLLLLLLLULDLLURUUUURRRRUURRDDRRRDDLLRDLLURRRRURRRRRRRRRRRRRRDDDDDD")
        assertEquals(4497, gameboardBeard2.getScore())
        assertEquals(Gameboard.State.WON, gameboardBeard2.getState())

        val gameboardTrampoline1 = Gameboard("maps/trampoline1.map")
        gameboardTrampoline1.act("RRLDDRRRUULDLLLURRRRRRDD")
        assertEquals(426, gameboardTrampoline1.getScore())
        assertEquals(Gameboard.State.WON, gameboardTrampoline1.getState())

        val gameboardTrampoline2 = Gameboard("maps/trampoline2.map")
        gameboardTrampoline2.act("RRRLDDDRUDRRULURRLLDLLUUULLLLLLULDRRRDRRRUULDLULLLLLLLLLLLUUURRULLULLUDUUDRRDRDDLL")
        assertEquals(1718, gameboardTrampoline2.getScore())
        assertEquals(Gameboard.State.WON, gameboardTrampoline2.getState())

        val gameboardFlood1 = Gameboard("maps/flood1.map")
        gameboardFlood1.act("LLLLDDRRRRLDRDLRDLRRUL")
        assertEquals(228, gameboardFlood1.getScore())
        assertEquals(Gameboard.State.DEAD, gameboardFlood1.getState())

        val gameboardFlood1_1 = Gameboard("maps/flood1.map")
        gameboardFlood1_1.act("LLLLDDDRRRDDRRULLLLUURRRRRRRDDDD")
        assertEquals(943, gameboardFlood1_1.getScore())
        assertEquals(Gameboard.State.WON, gameboardFlood1_1.getState())

        val gameboardHorock1 = Gameboard("maps/horock1.map")
        gameboardHorock1.act("DLLLLDDDDRRURRRRRDDLLRDDDRRRULLLLUURUULUURRRRUUUURRLLRRLDRLURURRDDUUUUUUUULU")
        assertEquals(749, gameboardHorock1.getScore())
        assertEquals(Gameboard.State.WON, gameboardHorock1.getState())

        val gameboardHorock3 = Gameboard("maps/horock3.map")
        gameboardHorock3.act("URRUULLUUUUURUUURRRDRRRRDDRRRRRUURULLLDRLLULLLLDDLDDRLRDRLDRRLDLRRRLDDLLLLRRRRRURLDRRLRURRDLDURLDDRLLLLLLLLLLRRURRRDRURRRDRLA")
        assertEquals(1576, gameboardHorock3.getScore())
        assertEquals(Gameboard.State.ABORTED, gameboardHorock3.getState())
    }
}