.globl indexOf max sum13 sum67
.text

#By the wonderous Andrea Mantke and Hannah Cain

indexOf: #a0 is the number searching for, a1 is the array
	iloop:
		lw $t0, ($a1)
		beq $t0, $a0, found #if found
		bltz $t0, done #if not found
		addi $t1, $t1, 1 #index count ++
		addi $a1, $a1, 4 # i++
		j iloop
	
	done:
		addi $v0, $0, -1 #set to -1
		jr $ra
		
	found:
		addi $v0, $t1, 0 #return value
		jr $ra 

max: #a0 is the array, a1 is the length
	addi $t2, $0, 0 #set t2 to 0
	
	mloop:
		lw $t0, ($a0)
		beq $t3, $a1, end #if length array = i, then end
		slt $t1, $t0, $t2 # $t1 = 0 if $t0 > $t2
		beqz $t1, switch #if $t0 > $t2, make value of $t2 = value of $t0
	cont:
		addi $t3, $t3, 1 #index count ++
		addi $a0, $a0, 4 # i++
		j mloop
	
	switch: 
		add $t2, $0, $t0 #swap vals of $t0 and $t2
		j cont
	
	end:
		add $v0, $0, $t2 #return value
		jr $ra
	
sum13: #a0 is the array, a1 iss the size of the array 
 	addi $v0, $v0, 0 #set result to 0
 	
 	thirteenloop:
 		lw $t0, ($a0) #set t0 to the first in the array
 		beq $t0, 13, thirteen #branch if it is a thirteen
 		add $v0, $v0, $t0 #add if it is not
 	
 		addi $t3, $t3, 1 #where are you in the array?
 		beq $t3, $a1,  thirteenfinished #branch if you're at the end
 		addi $a0, $a0, 4 #move through the array
 	
 		j thirteenloop
 	
 	thirteen: 

 		addi $t3, $t3, 1 #add 1, 
 		beq $t3, $a1,  thirteenfinished #out if done
 		addi $a0, $a0, 4 #move through the array
 		
 		addi $t3, $t3, 1 #add 1,
 		beq $t3, $a1,  thirteenfinished #out if done
 		addi $a0, $a0, 4 #move through the array
		
		j thirteenloop

sum67: #a0 is the array, a1 is the length
	addi $t7, $0, 7 #int t7 = 7
	addi $t6, $0, 6 #int t6 = 6
	addi $t5, $0, 0 #boolean flag
	addi $t4, $0, 0 #sum
	
	ssloop:
		lw $t0, ($a0)
		beq $t3, $a1, ssend #index at the end of the array
		beq $t0, $t6, six #if a six
	sscont1:
		beq $t0, $t7, seven #if a seven
	sscont2:
		beqz $t5, add #add to sum if flag is false
	sscont3:
		addi $a0, $a0, 4 #i ++
		addi $t3, $t3, 1 #index count ++
		j ssloop
	
	six:
		addi $t5, $0, 1 #flag = true
		j sscont1
	
	seven:
		bne $t5, $0, sev2 #if flag is true
		j sscont2
	sev2:
		addi $t5, $t5, 0 #flag = false
		j sscont2
	
	add:
		add $t4, $t4, $t0 #add to sum
		j sscont3
	
	ssend:
		addi $v0, $t4, 0 #return value
		jr $ra
	
	
