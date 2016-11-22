# Lego-Slam


I fell in love with how robot can know where they are in the world and actually move, navigate. I wanted to be able to do same and even improve on what has been done, but I have been searching on the internet and anywhere on how to proceed, but what i find are journals, videos, and even projects that has been done, but all these seems complex for me, as i am new to the field. That is what prompted this repo, to help people like me to learn the process from scratch to when you can fully understand journals, papers, etc that you will find on the web. If you follow this repo starting from the first commit or stage, am very sure you will be very well informed before the end. I will also try as much as possible to explain everything i do in details as time goes on. You might be wondering, "WHY USE LEGO, WHEN THERE ARE SO MANY BOARDS OUT THERE", isn't lego supposed to be for kids. To answer this.
	Firstly, any board would have sufficed, but for me that was the components i have access to, why will i want to spend more to get what i can already have.
	Secondly, looking at LEGO, it doeasn't have all the issues associated with other board, like you don't have to worry about soldering wires or components together, etc.
	As time goes on i will be updating the reason why.

	
	PROCEDURE TAKE IN THE WHOLE PROJECT
	
#1-
	to implement SLAM, sensors play an important role, in getting data to perform all the algorithm on them. Sensors to measure distance is been used in the first stage of the project. Looking online at the sensors used, so many are available, and Range sensors are very expensive which is why I make do with what i have which is the ultrasonic sensor. The ultrasonic sensor does not have a wide range of capture like Lidar-lite does. To improve on it, I mounted it on a servo motor to make it rotate, so its view is now 180 degrees, still not up to the Lidar-lite standard, but still okay. check the pic directory for how the setup is. The data from the lego is sent to the pc for processing through a USB.
