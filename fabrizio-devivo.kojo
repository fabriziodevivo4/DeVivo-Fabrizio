clear()
val cb = canvasBounds
val pic1 = Picture.rectangle(25, 50)
pic1.setPosition(cb.x + cb.width / 2, cb.y)
val pic2 = Picture.pentagon(50, 50)
pic2.setPosition(cb.x, cb.y + cb.height / 2)
draw(pic1, pic2)
