package frs.hotgammon.variants.factory;

import frs.hotgammon.framework.Game;
import frs.hotgammon.HotgammonFactory;
import frs.hotgammon.MoveValidator;
import frs.hotgammon.RollDeterminer;
import frs.hotgammon.TurnDeterminer;
import frs.hotgammon.WinnerDeterminer;
import frs.hotgammon.common.GameImpl;
import frs.hotgammon.variants.movevalidators.SimpleMoveValidator;
import frs.hotgammon.variants.rolldeterminers.FixedDiceRollDeterminer;
import frs.hotgammon.variants.turndeterminers.AlternatingTurnDeterminer;
import frs.hotgammon.variants.winnerdeterminers.BearOffWinnerDeterminer;
import frs.hotgammon.variants.winnerdeterminers.SixMoveWinnerDeterminer;

public class GammaFactory implements HotgammonFactory {
	Game game;
	
	private MoveValidator moveValidator = new SimpleMoveValidator();
	private WinnerDeterminer winnerDeterminer = new BearOffWinnerDeterminer();
	private TurnDeterminer turnDeterminer = new AlternatingTurnDeterminer();
	private RollDeterminer rollDeterminer = new FixedDiceRollDeterminer();


	@Override
	public MoveValidator getMoveValidator() {
		// TODO Auto-generated method stub
		return moveValidator;
	}

	@Override
	public WinnerDeterminer getWinnerDeterminer() {
		// TODO Auto-generated method stub
		return winnerDeterminer;
	}

	@Override
	public TurnDeterminer getTurnDeterminer() {
		// TODO Auto-generated method stub
		return turnDeterminer;
	}

	@Override
	public RollDeterminer getRollDeterminer() {
		// TODO Auto-generated method stub
		return rollDeterminer;
	}
	
	@Override
	public void setFactory(GameImpl game) {
		
		this.game = game;
		
		this.winnerDeterminer.setGame(game);
		this.moveValidator.setGame(game);
		this.turnDeterminer.setGame(game);
		this.rollDeterminer.setGame(game);
		
	}



}