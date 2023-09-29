import processing.core.PImage;

import java.util.List;

abstract class MoveEntity extends ActionEntity {

    public MoveEntity(String id, Point position, List<PImage> images, int imageIndex, double actionPeriod, double animationPeriod) {
        super(id, position, images, imageIndex, actionPeriod, animationPeriod);
    }

    abstract Point nextPosition(WorldModel world, Point destPos);

    abstract boolean moveTo(WorldModel world, Entity target, EventScheduler scheduler);

}
