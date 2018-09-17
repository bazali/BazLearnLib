class CoffeeTeaSUL {          
enum Input{cof_btn,rst,coin,token}; 
enum Output{ok,nok,coffee,cash,token}
enum State{S0,S1,S2,S3}; 
public State internalState = State.S0;
	
	public Output CoffeeSULController(Input in) {
		switch(in) {
		case rst:
			switch(internalState)
			{
			case S0:
				internalState=State.S0;
				return Output.ok;
			case S1:
				internalState=State.S0;
				return Output.ok;
			case S2:
				internalState=State.S0;
				return Output.ok;
			case S3:
				internalState=State.S0;
				return Output.ok;
			}
			
		case coin: 
			switch(internalState) 
			{
			case S0:
				internalState=State.S1;
				return Output.ok;
			case S1:
				internalState=State.S2;
				return Output.ok;
			case S2:
				internalState=State.S3;
				return Output.ok;
			case S3:
				internalState=State.S3;
				return Output.cash;
			}
			
		case token:
			switch(internalState)
			{ 
			case S0:
				internalState=State.S3;
				return Output.ok;
			case S1:
				internalState=State.S3;
				return Output.cash;
			case S2:
				internalState=State.S3;
				return Output.cash;
			case S3:
				internalState=State.S3;
				return Output.token;
			}
		case cof_btn:
			switch(internalState)
			{ 
			case S0:
				internalState=State.S0;
				return Output.nok;
			case S1:
				internalState=State.S1;
				return Output.nok;
			case S2:
				internalState=State.S2;
				return Output.nok;
			case S3:
				internalState=State.S0;
				return Output.coffee;
		    } 
        }
		
		return null;
	} 
	
} 