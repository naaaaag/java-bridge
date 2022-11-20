package bridge;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private final List<String> bridge;
    private int coordinate = -1;
    private boolean isDirectionanAndLocationSame;
    public boolean doesPlayerRetry;
    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public BridgeGame(List<String> bridge) {
        this.bridge = bridge;
    }

    public void move() {
        if (isDirectionanAndLocationSame == true) {
            coordinate ++;
        }
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
        if (isDirectionanAndLocationSame == false) {
            InputView input = new InputView();
            String gameCommand = input.readGameCommand();

            doesPlayerRetry = convertGameComand(gameCommand);
        }
    }

    private Boolean checkDirectionAndLocationSame(String direction, String bridgeLocation) {
        if (direction.equals(bridgeLocation)) {
            return true;
        }
        if (!direction.equals(bridgeLocation)) {
            return false;
        }
        return null;
    }

    private Boolean convertGameComand(String gameComand) {
        if (gameComand.equals("R") {
            return true;
        }
        if(gameComand.equals(("Q")) {
            return false;
        }
        return null;
    }
}
