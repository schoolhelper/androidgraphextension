package tech.schoolhelper.androidgraphextension

import android.graphics.Point
import android.graphics.PointF
import android.view.MotionEvent

/**
	* Method calculate dimension to MotionEvent
	*/
fun Point.distanceTo(event: MotionEvent): Double {
	return dim(PointF(this), PointF(event))
}

/**
	* Method calculate dimension to Point
	*/
fun Point.distanceTo(point: Point): Double {
	return dim(PointF(this), PointF(point))
}

/**
	* Method calculate dimension to PointF
	*/
fun Point.distanceTo(pointF: PointF): Double {
	return dim(PointF(this), pointF)
}

/**
	* Method calculate dimension to coordinate
	* @param x
	* @param y
	*/
fun Point.distanceTo(x: Int, y: Int): Double {
	return dim(PointF(this), PointF(x, y))
}

/**
	* Method calculate dimension to coordinate
	* @param x
	* @param y
	*/
fun Point.distanceTo(x: Float, y: Float): Double {
	return dim(PointF(this), PointF(x, y))
}

/**
	* Method calculate dimension to coordinate
	* @param x
	* @param y
	*/
fun Point.distanceTo(x: Double, y: Double): Double {
	return dim(PointF(this), PointF(x, y))
}

/**
	* Convert Point to PointF;
	* @return PointF based on this instance
	*/
fun Point.toPointF() = PointF(this)

/**
	* Return new Point object (x = originX * -1, y = originY * -1);
	*/
operator fun Point.unaryMinus() = Point(-this.x, -this.y)

/**
	* Minus one point from another point;
	* x = this.x - a
	* y = this.y - a
	* @return new instance of Point
	*/
operator fun Point.minus(a: Float) = this.apply {
	offset(a.toInt(), a.toInt())
}

/**
	* Plus point to this point,
	* x = this.x + point.x
	* y = tihs.y + point.y
	* @return changed point;
	*/
operator fun Point.plus(point: Point) = this.apply {
	offset(point.x, point.y)
}

operator fun Point.times(k: Double) = Point((this.x * k).toInt(), (this.y * k).toInt())

operator fun Point.times(k: Float) = this.times(k.toDouble())

operator fun Point.times(k: Int) = this.times(k.toDouble())

operator fun Point.div(k: Double) = Point((this.x / k).toInt(), (this.y / k).toInt())

operator fun Point.div(k: Float) = this.times(k.toDouble())

operator fun Point.div(k: Int) = this.times(k.toDouble())
